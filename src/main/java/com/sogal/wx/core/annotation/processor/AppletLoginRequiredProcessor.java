package com.sogal.wx.core.annotation.processor;

import com.sogal.common.util.JedisUtil;
import com.sogal.wx.core.annotation.AppletLoginRequired;
import com.sogal.wx.core.dao.domain.base.GlobalConstantValue;
import com.sogal.wx.core.dao.domain.base.RedisIndex;
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
public class AppletLoginRequiredProcessor implements HandlerInterceptor {

    public AppletLoginRequiredProcessor(JedisUtil jedisUtil){
        this.jedisUtil = jedisUtil;
    }

    private JedisUtil jedisUtil;

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        boolean flag = true;
        if (o instanceof HandlerMethod) {
            HandlerMethod handlerMethod = (HandlerMethod) o;
            AppletLoginRequired permission = getAnnotation(handlerMethod, AppletLoginRequired.class);
            if (permission != null) {
                String headerToken = httpServletRequest.getHeader(GlobalConstantValue.APPLET_TOKEN_KEY);
                if (StringUtils.isBlank(headerToken)) {
                    flag = false;
                }
                String json = jedisUtil.get(String.format(RedisIndex.小程序登陆TOKEN.getIndex(), headerToken));
                if (StringUtils.isBlank(json)) {
                    flag = false;
                }
            }
        }
        if(!flag){
            DecorateResponseTool.decorateResponse(httpServletResponse, WechatCoreError.WITHOUT_LOGIN);
        }
        return flag;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o,
                           ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
                                Object o, Exception e) throws Exception {

    }


}
