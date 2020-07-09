package com.sogal.wx.core.annotation.processor;

import com.sogal.common.util.StringUtil;
import com.sogal.wx.core.annotation.UserQueryDetail;
import com.sogal.wx.core.dao.domain.design.QueryDesignDetail;
import com.sogal.wx.core.dao.domain.user.UserLoginToken;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

public class UserQueryDetailProcessor implements HandlerMethodArgumentResolver {

    private AppletLoginHandlerProcessor appletLoginHandlerProcessor;

    public UserQueryDetailProcessor(AppletLoginHandlerProcessor appletLoginHandlerProcessor){
        this.appletLoginHandlerProcessor = appletLoginHandlerProcessor;
    }

    @Override
    public boolean supportsParameter(MethodParameter methodParameter) {
        return QueryDesignDetail.class.isAssignableFrom(methodParameter.getParameterType())&&
                methodParameter.hasParameterAnnotation(UserQueryDetail.class);
    }

    @Override
    public Object resolveArgument(MethodParameter methodParameter, ModelAndViewContainer modelAndViewContainer,
                                  NativeWebRequest nativeWebRequest, WebDataBinderFactory webDataBinderFactory)
            throws Exception {
        Object o = appletLoginHandlerProcessor.resolveArgument(methodParameter, modelAndViewContainer,
                nativeWebRequest, webDataBinderFactory);
        if(null == o){
            return null;
        }
        UserLoginToken u = (UserLoginToken) o;
        String designId = nativeWebRequest.getParameter("designId");
        String designNo = nativeWebRequest.getParameter("designNo");
        String uniqueNo = nativeWebRequest.getParameter("uniqueNo");
        String shareRecordId = nativeWebRequest.getParameter("shareRecordId");
        QueryDesignDetail queryDesignDetail = new QueryDesignDetail();
        queryDesignDetail.setDesignId(designId);
        queryDesignDetail.setDesignNo(designNo);
        queryDesignDetail.setUniqueNo(uniqueNo);
        queryDesignDetail.setUserLoginToken(u);
        queryDesignDetail.setVisitBrowseId(StringUtil.uuid());
        queryDesignDetail.setShareRecordId(shareRecordId);
        return queryDesignDetail;
    }
}
