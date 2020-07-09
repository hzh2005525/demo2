package com.sogal.wx.core.annotation.processor;

import com.sogal.wx.core.annotation.MyCollectSign;
import com.sogal.wx.core.dao.domain.base.WechatCategory;
import com.sogal.wx.core.dao.domain.mine.MyCollectSignDTO;
import com.sogal.wx.core.dao.domain.promotion.UserBasicInfo;
import com.sogal.wx.core.dao.domain.user.UserLoginToken;
import com.sogal.wx.core.dao.mapper.UserMpMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

@Component
public class MyCollectSignProcessor implements HandlerMethodArgumentResolver {

    @Autowired
    private AppletLoginHandlerProcessor appletLoginHandlerProcessor;

    @Autowired
    private UserMpMapper userMpMapper;

    @Override
    public boolean supportsParameter(MethodParameter methodParameter) {
        return MyCollectSignDTO.class.isAssignableFrom(methodParameter.getParameterType())
                && methodParameter.hasParameterAnnotation(MyCollectSign.class) ;
    }

    @Override
    public Object resolveArgument(MethodParameter methodParameter, ModelAndViewContainer modelAndViewContainer, NativeWebRequest nativeWebRequest, WebDataBinderFactory webDataBinderFactory) throws Exception {
        Object o = appletLoginHandlerProcessor.resolveArgument(methodParameter, modelAndViewContainer, nativeWebRequest, webDataBinderFactory);
        if(null == o) return null;
        UserLoginToken u = (UserLoginToken) o;
        WechatCategory category = u.getWechatUser().getCategory();
        UserBasicInfo userBasicInfo = null;
        if (WechatCategory.MEIJIA.equals(category)) {
            String unionId = u.getWechatUser().getUnionId();
            if (StringUtils.isNotBlank(unionId)) {
                userBasicInfo = userMpMapper.findUserInfoByUnionId(unionId, WechatCategory.DESIGN);
                if (userBasicInfo == null) {
                    return null;
                }
            } else {
                return null;
            }
        }
        MyCollectSignDTO myCollectSignDTO = new MyCollectSignDTO();
        myCollectSignDTO.setUserId(WechatCategory.MEIJIA.equals(category) ? userBasicInfo.getId() : u.getWechatUser().getId());
        String realm = nativeWebRequest.getParameter("realm");
        myCollectSignDTO.setRealm(realm);
        return myCollectSignDTO;
    }
}
