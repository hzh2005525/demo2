package com.sogal.wx.core.annotation.processor;

import com.sogal.wx.core.annotation.ViewMyFootMark;
import com.sogal.wx.core.dao.domain.mine.MyFootMarkDTO;
import com.sogal.wx.core.dao.domain.user.UserLoginToken;
import com.sogal.wx.core.tool.DateTool;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

@Component
public class ViewMyFootmarkProcessor implements HandlerMethodArgumentResolver {

    @Autowired
    private AppletLoginHandlerProcessor appletLoginHandlerProcessor;

    private static final String datePattern = "yyyy-MM-dd";

    @Override
    public boolean supportsParameter(MethodParameter methodParameter) {
        return MyFootMarkDTO.class.isAssignableFrom(methodParameter.getParameterType())
                && methodParameter.hasParameterAnnotation(ViewMyFootMark.class) ;
    }

    @Override
    public Object resolveArgument(MethodParameter methodParameter, ModelAndViewContainer modelAndViewContainer, NativeWebRequest nativeWebRequest, WebDataBinderFactory webDataBinderFactory) throws Exception {
        Object o = appletLoginHandlerProcessor.resolveArgument(methodParameter, modelAndViewContainer, nativeWebRequest, webDataBinderFactory);
        if(null == o) return null;
        UserLoginToken u = (UserLoginToken) o;
        MyFootMarkDTO myFootMarkDTO = new MyFootMarkDTO();
        myFootMarkDTO.setUserId(u.getWechatUser().getId());
        String today = DateTool.TODAY.getDate(datePattern);
        String time = nativeWebRequest.getParameter("time");
        if(StringUtils.isBlank(time)){
            time = "LAST_WEEK";
        }
        DateTool dateTool = Enum.valueOf(DateTool.class, time);
        time = dateTool.getDate(datePattern);
        myFootMarkDTO.setEndTime(today + " 23:59:59");
        myFootMarkDTO.setStartTime(time + " 00:00:00");
        return myFootMarkDTO;
    }
}
