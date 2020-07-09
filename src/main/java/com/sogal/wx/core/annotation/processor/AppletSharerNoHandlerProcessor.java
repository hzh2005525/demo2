package com.sogal.wx.core.annotation.processor;

import com.sogal.wx.core.annotation.AppletSharerNo;
import com.sogal.wx.core.dao.domain.base.GlobalConstantValue;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;
@Slf4j
@Component
public class AppletSharerNoHandlerProcessor implements HandlerMethodArgumentResolver {

    @Override
    public boolean supportsParameter(MethodParameter methodParameter) {
        return String.class.isAssignableFrom(methodParameter.getParameterType())&&
            methodParameter.hasParameterAnnotation(AppletSharerNo.class);
    }

    @Override
    public Object resolveArgument(MethodParameter methodParameter, ModelAndViewContainer modelAndViewContainer, NativeWebRequest nativeWebRequest, WebDataBinderFactory webDataBinderFactory) throws Exception {
        String header = nativeWebRequest.getHeader(GlobalConstantValue.APPLET_SHARER_NO);
        log.info("header:"+ header);
        if(!StringUtils.isBlank(header)){
            return header;
        }
        return null;
    }
}
