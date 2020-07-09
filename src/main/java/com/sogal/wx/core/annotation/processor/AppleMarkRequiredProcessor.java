package com.sogal.wx.core.annotation.processor;

import com.sogal.wx.core.annotation.AppletMarkRequired;
import com.sogal.wx.core.dao.domain.base.GlobalConstantValue;
import com.sogal.wx.core.dao.domain.base.WechatCategory;
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
 * Created by xiaoxuwang on 2019/4/4.
 */
public class AppleMarkRequiredProcessor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        boolean flag = Boolean.TRUE;
        if(o instanceof HandlerMethod){
            HandlerMethod handlerMethod = (HandlerMethod) o;
            AppletMarkRequired permission = getAnnotation(handlerMethod, AppletMarkRequired.class);
            if (permission != null) {
                String mark = httpServletRequest.getHeader(GlobalConstantValue.APPLET_TYPE_MARK);
                if (StringUtils.isBlank(mark)) {
                    flag = false;
                }
                try{
                    Enum.valueOf(WechatCategory.class, mark);
                }catch (Exception e){
                    flag = false;
                }
            }
            if(!flag){
                DecorateResponseTool.decorateResponse(httpServletResponse, WechatCoreError.APPLET_MARK_ERROR);
            }
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
