package com.sogal.wx.core.annotation.processor;

import com.sogal.wx.core.annotation.UserQueryDesignerDetail;
import com.sogal.wx.core.dao.domain.designer.QueryDesignerDetail;
import com.sogal.wx.core.dao.domain.user.UserLoginToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

@Component
public class UserQueryDesignerDetailProcessor implements HandlerMethodArgumentResolver {

    @Autowired
    private AppletLoginHandlerProcessor appletLoginHandlerProcessor;

    @Override
    public boolean supportsParameter(MethodParameter methodParameter) {
        return QueryDesignerDetail.class.isAssignableFrom(methodParameter.getParameterType())
                && methodParameter.hasParameterAnnotation(UserQueryDesignerDetail.class);
    }

    @Override
    public Object resolveArgument(MethodParameter methodParameter, ModelAndViewContainer modelAndViewContainer, NativeWebRequest nativeWebRequest, WebDataBinderFactory webDataBinderFactory) throws Exception {
        Object o = appletLoginHandlerProcessor.resolveArgument(methodParameter, modelAndViewContainer, nativeWebRequest, webDataBinderFactory);
        if(null == o){
            return null;
        }
        UserLoginToken u = (UserLoginToken) o;
        String designerId = nativeWebRequest.getParameter("designerId");
        QueryDesignerDetail queryDesignerDetail = new QueryDesignerDetail();
        queryDesignerDetail.setDesignerId(designerId);
        queryDesignerDetail.setUserLoginToken(u);
        return queryDesignerDetail;
    }
}
