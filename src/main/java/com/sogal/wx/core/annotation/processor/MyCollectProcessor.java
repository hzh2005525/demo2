package com.sogal.wx.core.annotation.processor;

import com.sogal.wx.core.annotation.MyCollect;
import com.sogal.wx.core.dao.domain.base.WechatCategory;
import com.sogal.wx.core.dao.domain.mine.MyCollectDTO;
import com.sogal.wx.core.dao.domain.promotion.UserBasicInfo;
import com.sogal.wx.core.dao.domain.user.UserLoginToken;
import com.sogal.wx.core.dao.mapper.UserMpMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

@Component
public class MyCollectProcessor implements HandlerMethodArgumentResolver {

    @Autowired
    private AppletLoginHandlerProcessor appletLoginHandlerProcessor;

    @Autowired
    private UserMpMapper userMpMapper;

    @Override
    public boolean supportsParameter(MethodParameter methodParameter) {
        return MyCollectDTO.class.isAssignableFrom(methodParameter.getParameterType())
                && methodParameter.hasParameterAnnotation(MyCollect.class) ;
    }

    @Override
    public Object resolveArgument(MethodParameter methodParameter, ModelAndViewContainer modelAndViewContainer, NativeWebRequest nativeWebRequest, WebDataBinderFactory webDataBinderFactory) throws Exception {
        Object o = appletLoginHandlerProcessor.resolveArgument(methodParameter, modelAndViewContainer, nativeWebRequest, webDataBinderFactory);
        if(null == o) return null;
        UserLoginToken u = (UserLoginToken) o;
        WechatCategory category = u.getWechatUser().getCategory();
        UserBasicInfo userBasicInfo = null;
        if (WechatCategory.MEIJIA.equals(category)) {
            String unionId = u.getWechatUser().getUnionId();
            if (StringUtils.isNotBlank(unionId)) {
                userBasicInfo = userMpMapper.findUserInfoByUnionId(unionId, WechatCategory.DESIGN);
                if (userBasicInfo == null) {
                    return null;
                }
            } else {
                return null;
            }
        }

        MyCollectDTO myCollectDTO = new MyCollectDTO();
        myCollectDTO.setUserId(WechatCategory.MEIJIA.equals(category) ? userBasicInfo.getId() : u.getWechatUser().getId());
        String kind = nativeWebRequest.getParameter("kind");
//        if(StringUtils.isNotBlank(kindStr)){
//            myCollectDTO.setKind(Enum.valueOf(WechatKind.class, kindStr));
//        }
        myCollectDTO.setKind(WechatCategory.MEIJIA.equals(category) ? WechatCategory.DESIGN.name() : kind);
        return myCollectDTO;
    }

}
