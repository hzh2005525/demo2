package com.sogal.wx.core.annotation.processor;

import com.sogal.common.util.StringUtil;
import com.sogal.wx.core.annotation.UserShareDesign;
import com.sogal.wx.core.dao.domain.base.GlobalConstantValue;
import com.sogal.wx.core.dao.domain.base.WechatCategory;
import com.sogal.wx.core.dao.domain.base.WechatRealm;
import com.sogal.wx.core.dao.domain.design.WechatDesign;
import com.sogal.wx.core.dao.domain.image.WechatImage;
import com.sogal.wx.core.dao.domain.share.ShareMethod;
import com.sogal.wx.core.dao.domain.share.ShareTemplate;
import com.sogal.wx.core.dao.domain.share.UserShareInfo;
import com.sogal.wx.core.dao.domain.user.UserLoginToken;
import com.sogal.wx.core.dao.domain.user.WechatUser;
import com.sogal.wx.core.dao.mapper.WechatDesignMapper;
import com.sogal.wx.core.dao.mapper.WechatImageMapper;
import com.sogal.wx.core.dao.mapper.WechatShareTemplateMapper;
import com.sogal.wx.core.qrcode.QRCodeBody;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

/**
 * Created by xiaoxuwang on 2019/3/1.
 */
@Component@Slf4j
public class UserShareDesignProcessor implements HandlerMethodArgumentResolver{

    @Autowired
    private WechatDesignMapper wechatDesignMapper;

    @Autowired
    private WechatImageMapper wechatImageMapper;

    @Autowired
    private WechatShareTemplateMapper wechatShareTemplateMapper;

    @Autowired
    private AppletLoginHandlerProcessor appletLoginHandlerProcessor;

    @Override
    public boolean supportsParameter(MethodParameter methodParameter) {
        return UserShareInfo.class.isAssignableFrom(methodParameter.getParameterType())&&
                methodParameter.hasParameterAnnotation(UserShareDesign.class);
    }

    @Override
    public Object resolveArgument(MethodParameter methodParameter, ModelAndViewContainer modelAndViewContainer,
                                  NativeWebRequest nativeWebRequest, WebDataBinderFactory webDataBinderFactory)
            throws Exception {
        Object o = appletLoginHandlerProcessor.resolveArgument(methodParameter, modelAndViewContainer, nativeWebRequest, webDataBinderFactory);
        if(null == o){
            return null;
        }
        UserLoginToken u = (UserLoginToken)o;
        String userNo = u.getWechatUser().getUserNo();
        String realmNo = nativeWebRequest.getParameter("realmNo");
        String realm = nativeWebRequest.getParameter("realm");
        String shareRecordId = nativeWebRequest.getParameter("shareRecordId");
        String version = nativeWebRequest.getParameter("version");
        String mark = nativeWebRequest.getHeader(GlobalConstantValue.APPLET_TYPE_MARK);
        log.info("current version={},mark={}",version,mark);
        ShareMethod method = null;
        if(StringUtils.isNotEmpty(nativeWebRequest.getParameter("method"))){
             method = Enum.valueOf(ShareMethod.class, nativeWebRequest.getParameter("method"));
            log.info("shareRecordId={},shareMethod={}",shareRecordId,method);
        }

        if(StringUtils.isBlank(realmNo)){
            return null;
        }
        if(StringUtils.isBlank(realm)|| WechatRealm.WECHAT_DESIGN.name().equals(realm)
                || WechatCategory.MEIJIA.name().equals(realm)){
            log.info("枚举与字符串realm={}是否相等",realm);
            String avatarUrl =u.getAvatarUrl();
            WechatUser wechatUser = u.getWechatUser();
            if(StringUtils.isBlank(avatarUrl) && null != wechatUser){
                avatarUrl = wechatUser.getAvatarUrl();
            }
            String nickName = u.getNickName();
            if(StringUtils.isBlank(nickName) && null != wechatUser){
                nickName= wechatUser.getNickName();
            }
            log.info("用户头像={}",avatarUrl);
            QRCodeBody qrCodeBody = new QRCodeBody(WechatRealm.WECHAT_DESIGN.getType().name(), StringUtils.join(realmNo, ",", userNo));
            qrCodeBody.setSharerName(nickName);
            qrCodeBody.setSharerUrl(avatarUrl);
            UserShareInfo userShareInfo = new UserShareInfo(WechatRealm.WECHAT_DESIGN.name());
            userShareInfo.setQrCodeBody(qrCodeBody);
            userShareInfo.setRealmNo(realmNo);
            userShareInfo.setUserNo(userNo);
            userShareInfo.setShareRecordId(shareRecordId);
            userShareInfo.setVersion(version);
            WechatDesign wechatDesign = wechatDesignMapper.findEntityByNo(userShareInfo.getRealmNo());
            if(null == wechatDesign){
                log.warn("文章不存在,结束生成海报流程,文章编号={}",realmNo);
                return null;
            }
            if(StringUtils.isBlank(wechatDesign.getTitle())){
                return userShareInfo;
            }
            String realmPicUrl = null;
            if(StringUtils.isNotBlank(wechatDesign.getPoster())){
                WechatImage posterImage = wechatImageMapper.findEntityById(wechatDesign.getPoster());
                if(null != posterImage){
                    realmPicUrl = posterImage.getImageUrl();
                }
            }
            if(StringUtils.isNotBlank(wechatDesign.getKind())){
                if("ACTIVITY.WUKONG".equals(wechatDesign.getKind()) && WechatCategory.REFORM.name().equals(mark)){
                    qrCodeBody.setType(wechatDesign.getKind());
                }else {
                    qrCodeBody.setType(wechatDesign.getKind().substring(0,1));
                }
            }
            if(StringUtils.isBlank(realmPicUrl) && StringUtils.isNotBlank(wechatDesign.getCover())){
                WechatImage coverImage = wechatImageMapper.findEntityById(wechatDesign.getCover());
                if(null != coverImage){
                    realmPicUrl = coverImage.getImageUrl();
                }
            }
            qrCodeBody.setRealmPicUrl(realmPicUrl);//文章配图
            qrCodeBody.setRealmTitle(wechatDesign.getTitle());
            qrCodeBody.setScene(StringUtil.uuid());
            ShareTemplate shareTemplate = wechatShareTemplateMapper.findShareTemplateDetailById(wechatDesign.getTemplateId());
            qrCodeBody.setShareTemplate(shareTemplate);
            return userShareInfo;
        }else{
            UserShareInfo userShareInfo = new UserShareInfo(realm);
            userShareInfo.setRealmNo(realmNo);
            userShareInfo.setUserNo(userNo);
            userShareInfo.setShareRecordId(shareRecordId);
            userShareInfo.setMethod(method);
            userShareInfo.setVersion(version);
            log.info("----走到这了---userShareInfo.ShareRecordId={},shareMethod={}",
                    userShareInfo.getShareRecordId(),userShareInfo.getMethod());
            return userShareInfo;
        }
    }
}
