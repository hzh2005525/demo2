package com.sogal.wx.core.annotation.processor;

import com.google.gson.Gson;
import com.sogal.common.util.JedisUtil;
import com.sogal.wx.core.annotation.AppletUserInfo;
import com.sogal.wx.core.dao.domain.base.GlobalConstantValue;
import com.sogal.wx.core.dao.domain.base.RedisIndex;
import com.sogal.wx.core.dao.domain.user.UserLoginToken;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
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
public class AppletLoginHandlerProcessor implements HandlerMethodArgumentResolver{

    @Autowired
    private JedisUtil jedisUtil;

    @Autowired
    private Gson gson;

    @Override
    public boolean supportsParameter(MethodParameter methodParameter) {
        return UserLoginToken.class.isAssignableFrom(methodParameter.getParameterType())&&
                methodParameter.hasParameterAnnotation(AppletUserInfo.class);
    }

    @Override
    public Object resolveArgument(MethodParameter methodParameter, ModelAndViewContainer modelAndViewContainer,
                                  NativeWebRequest nativeWebRequest, WebDataBinderFactory webDataBinderFactory)
            throws Exception {
        String token = nativeWebRequest.getHeader(GlobalConstantValue.APPLET_TOKEN_KEY);
        if(!StringUtils.isBlank(token)) {
            String tokenContent = jedisUtil.get(String.format(RedisIndex.小程序登陆TOKEN.getIndex(), token));
            if (!StringUtils.isBlank(tokenContent)) {
                return gson.fromJson(tokenContent, UserLoginToken.class);
            }
        }
        return null;
    }
}
