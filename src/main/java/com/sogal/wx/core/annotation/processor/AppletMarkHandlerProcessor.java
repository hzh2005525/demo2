package com.sogal.wx.core.annotation.processor;

import com.sogal.wx.core.annotation.AppletMark;
import com.sogal.wx.core.dao.domain.base.GlobalConstantValue;
import com.sogal.wx.core.dao.domain.base.WechatCategory;
import org.apache.commons.lang3.StringUtils;
import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

/**
 * Created by xiaoxuwang on 2019/2/19.
 */
@Component
public class AppletMarkHandlerProcessor implements HandlerMethodArgumentResolver{

    @Override
    public boolean supportsParameter(MethodParameter methodParameter) {
        return WechatCategory.class.isAssignableFrom(methodParameter.getParameterType())&&
                methodParameter.hasParameterAnnotation(AppletMark.class);
    }

    @Override
    public Object resolveArgument(MethodParameter methodParameter, ModelAndViewContainer modelAndViewContainer,
                                  NativeWebRequest nativeWebRequest, WebDataBinderFactory webDataBinderFactory)
            throws Exception {
        String mark = nativeWebRequest.getHeader(GlobalConstantValue.APPLET_TYPE_MARK);
        if(!StringUtils.isBlank(mark)) {
            return Enum.valueOf(WechatCategory.class, mark);
        }
        return null;
    }
}
