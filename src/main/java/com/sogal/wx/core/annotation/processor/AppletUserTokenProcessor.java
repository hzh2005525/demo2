package com.sogal.wx.core.annotation.processor;

import com.sogal.wx.core.annotation.AppletUserToken;
import com.sogal.wx.core.dao.domain.base.GlobalConstantValue;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

/**
 * Created by xiaoxuwang on 2019/2/26.
 */
public class AppletUserTokenProcessor implements HandlerMethodArgumentResolver {

    @Override
    public boolean supportsParameter(MethodParameter methodParameter) {
        return String.class.isAssignableFrom(methodParameter.getParameterType())&&
                methodParameter.hasParameterAnnotation(AppletUserToken.class);
    }

    @Override
    public Object resolveArgument(MethodParameter methodParameter, ModelAndViewContainer modelAndViewContainer,
                                  NativeWebRequest nativeWebRequest, WebDataBinderFactory webDataBinderFactory)
            throws Exception {
        return nativeWebRequest.getHeader(GlobalConstantValue.APPLET_TOKEN_KEY);
    }
}
