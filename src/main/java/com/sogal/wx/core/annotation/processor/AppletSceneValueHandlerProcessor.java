package com.sogal.wx.core.annotation.processor;

import com.sogal.wx.core.annotation.AppletSceneValue;
import com.sogal.wx.core.dao.domain.base.GlobalConstantValue;
import org.apache.commons.lang3.StringUtils;
import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

@Component
public class AppletSceneValueHandlerProcessor implements HandlerMethodArgumentResolver{
    @Override
    public boolean supportsParameter(MethodParameter methodParameter) {
        return String.class.isAssignableFrom(methodParameter.getParameterType())&&
                methodParameter.hasParameterAnnotation(AppletSceneValue.class);
    }

    @Override
    public Object resolveArgument(MethodParameter methodParameter, ModelAndViewContainer modelAndViewContainer,
                                  NativeWebRequest nativeWebRequest, WebDataBinderFactory webDataBinderFactory)
            throws Exception {
        String sceneValue = nativeWebRequest.getHeader(GlobalConstantValue.APPLET_SCENE_VALUE);
        if(!StringUtils.isBlank(sceneValue)){
            return sceneValue;
        }
        return null;
    }
}
