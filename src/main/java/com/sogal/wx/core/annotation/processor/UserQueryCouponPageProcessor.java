package com.sogal.wx.core.annotation.processor;

import com.sogal.wx.core.annotation.UserQueryCouponPage;
import com.sogal.wx.core.dao.domain.coupon.UserQueryCouponCondition;
import com.sogal.wx.core.dao.domain.user.UserLoginToken;
import com.sogal.wx.core.dao.domain.user.WechatUser;
import com.sogal.wx.core.dao.mapper.UserMpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

@Component
public class UserQueryCouponPageProcessor implements HandlerMethodArgumentResolver {

    @Autowired
    private AppletLoginHandlerProcessor appletLoginHandlerProcessor;

    @Autowired
    private UserMpMapper userMpMapper;

    @Override
    public boolean supportsParameter(MethodParameter methodParameter) {
        return UserQueryCouponCondition.class.isAssignableFrom(methodParameter.getParameterType())
                &&methodParameter.hasParameterAnnotation(UserQueryCouponPage.class);
    }

    @Override
    public Object resolveArgument(MethodParameter methodParameter, ModelAndViewContainer modelAndViewContainer, NativeWebRequest nativeWebRequest, WebDataBinderFactory webDataBinderFactory) throws Exception {
        Object o = appletLoginHandlerProcessor.resolveArgument(methodParameter, modelAndViewContainer, nativeWebRequest, webDataBinderFactory);
        if(null == o){
            return null;
        }
        UserLoginToken u = (UserLoginToken) o;
//        String pageStart = nativeWebRequest.getParameter("pageStart");
//        String pageSize = nativeWebRequest.getParameter("pageSize");
        UserQueryCouponCondition userQueryCouponCondition = new UserQueryCouponCondition();
        if(null == u || null == u.getWechatUser()){
            return null;
        }
        WechatUser wechatUser = userMpMapper.findUserMpById(u.getWechatUser().getId());
//        String status = nativeWebRequest.getParameter("status");
//        if(!StringUtils.isBlank(status)){
//            userQueryCouponCondition.setStatus(Arrays.asList(status.split(",")));
//        }
//        userQueryCouponCondition.setPageStart(Integer.parseInt(pageStart));
//        userQueryCouponCondition.setPageSize(Integer.parseInt(pageSize));
        userQueryCouponCondition.setUnionId(u.getWechatUser().getId());
        userQueryCouponCondition.setMobile(wechatUser.getMobile());
        userQueryCouponCondition.setUserLoginToken(u);
        return userQueryCouponCondition;
    }
}
