package com.sogal.wx.core.annotation.processor;

import com.sogal.wx.core.annotation.UserShare;
import com.sogal.wx.core.dao.domain.share.UserShareInfo;
import com.sogal.wx.core.dao.domain.user.UserLoginToken;
import com.sogal.wx.core.qrcode.QRCodeBody;
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
@Component
public class QrCodeBodyProcessor implements HandlerMethodArgumentResolver {

    @Autowired
    private AppletLoginHandlerProcessor appletLoginHandlerProcessor;

    @Override
    public boolean supportsParameter(MethodParameter methodParameter) {
        return UserShareInfo.class.isAssignableFrom(methodParameter.getParameterType())&&
                methodParameter.hasParameterAnnotation(UserShare.class);
    }

    @Override
    public Object resolveArgument(MethodParameter methodParameter, ModelAndViewContainer modelAndViewContainer,
                                  NativeWebRequest nativeWebRequest, WebDataBinderFactory webDataBinderFactory) throws Exception {
        Object o = appletLoginHandlerProcessor.resolveArgument(methodParameter, modelAndViewContainer, nativeWebRequest, webDataBinderFactory);
        if(null == o){
            return null;
        }
        UserLoginToken u = (UserLoginToken)o;
        String userNo = u.getWechatUser().getUserNo();
        String realmNo = nativeWebRequest.getParameter("realmNo");
//        WechatRealm realm = Enum.valueOf(WechatRealm.class, nativeWebRequest.getParameter("realm"));
//        if(null == realm||StringUtils.isBlank(realmNo)||null == realm.getType()){
//            return null;
//        }
        String realm = nativeWebRequest.getParameter("realm");
        if(StringUtils.isBlank(realm)){
            return null;
        }
        QRCodeBody qrCodeBody = new QRCodeBody(realm.substring(0,1), StringUtils.join(realmNo, ",", userNo));
        UserShareInfo userShareInfo = new UserShareInfo();
        userShareInfo.setQrCodeBody(qrCodeBody);
        userShareInfo.setRealmNo(realmNo);
        userShareInfo.setUserNo(userNo);
        userShareInfo.setRealm(realm);
        return userShareInfo;
    }
}
