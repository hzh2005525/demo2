package com.sogal.wx.core.annotation.processor;

import com.sogal.common.util.JedisUtil;
import com.sogal.wx.core.dao.domain.base.GlobalConstantValue;
import com.sogal.wx.core.dao.domain.base.RedisIndex;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by xiaoxuwang on 2019/2/26.
 */
public class UserLogoutProcessor implements HandlerInterceptor {

    public UserLogoutProcessor(JedisUtil jedisUtil){
        this.jedisUtil = jedisUtil;
    }

    private JedisUtil jedisUtil;

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        String token = httpServletRequest.getHeader(GlobalConstantValue.APPLET_TOKEN_KEY);
        if(!StringUtils.isBlank(token)){
            String userToken = String.format(RedisIndex.小程序登陆TOKEN.getIndex(), token);
            jedisUtil.del(userToken);
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
