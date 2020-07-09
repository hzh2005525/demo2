package com.sogal.wx.core.annotation.processor;

import com.sogal.common.domain.ComFinalParams;
import com.sogal.common.util.JedisUtil;
import com.sogal.wx.core.annotation.AdminLoginRequired;
import com.sogal.wx.core.error.WechatCoreError;
import com.sogal.wx.core.tool.DecorateResponseTool;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static com.sogal.common.util.AnnotationGet.getAnnotation;

/**
 * Created by xiaoxuwang on 2019/2/22.
 */
public class AdminLoginRequiredProcessor implements HandlerInterceptor {

    public AdminLoginRequiredProcessor(JedisUtil jedisUtil){
        this.jedisUtil = jedisUtil;
    }

    private JedisUtil jedisUtil;

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
                             Object o) throws Exception {
        boolean flag = Boolean.TRUE;
        if (o instanceof HandlerMethod) {
            HandlerMethod handlerMethod = (HandlerMethod) o;
            AdminLoginRequired permission = getAnnotation(handlerMethod, AdminLoginRequired.class);
            if (permission != null) {
                String headerToken = httpServletRequest.getHeader(ComFinalParams.TOKEN_HEAD);
                if (StringUtils.isBlank(headerToken)) {
                    flag = Boolean.FALSE;
                }
                String json = jedisUtil.get(ComFinalParams.TOKEN_TAG + headerToken);
                if (StringUtils.isBlank(json)) {
                    flag = Boolean.FALSE;
                }
            }
        }
        if(!flag){
            DecorateResponseTool.decorateResponse(httpServletResponse, WechatCoreError.WITHOUT_LOGIN);
        }
        return flag;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
