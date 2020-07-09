package com.sogal.wx.core.annotation.processor;

import com.sogal.wx.core.annotation.UserQueryDesignPage;
import com.sogal.wx.core.dao.domain.base.WechatCategory;
import com.sogal.wx.core.dao.domain.design.DesignQueryCondition;
import com.sogal.wx.core.dao.domain.design.DesignShowLevel;
import com.sogal.wx.core.dao.domain.design.OrderMethod;
import com.sogal.wx.core.dao.domain.user.UserLoginToken;
import com.sogal.wx.core.dao.mapper.WechatSysSignMapper;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import java.util.Arrays;
import java.util.List;

@Component
public class UserQueryDesignPageProcessor implements HandlerMethodArgumentResolver {

    @Autowired
    private AppletLoginHandlerProcessor appletLoginHandlerProcessor;

    @Autowired
    private WechatSysSignMapper wechatSysSignMapper;

    @Override
    public boolean supportsParameter(MethodParameter methodParameter) {
        return DesignQueryCondition.class.isAssignableFrom(methodParameter.getParameterType())
                &&methodParameter.hasParameterAnnotation(UserQueryDesignPage.class);
    }



    @Override
    public Object resolveArgument(MethodParameter methodParameter, ModelAndViewContainer modelAndViewContainer, NativeWebRequest nativeWebRequest, WebDataBinderFactory webDataBinderFactory) throws Exception {
        Object o = appletLoginHandlerProcessor.resolveArgument(methodParameter, modelAndViewContainer, nativeWebRequest, webDataBinderFactory);
        if(null == o){
            return null;
        }
        UserLoginToken u = (UserLoginToken) o;
//        String category = nativeWebRequest.getParameter("category");
        String kindStr = nativeWebRequest.getParameter("kind");
        String designNo = nativeWebRequest.getParameter("designNo");
        String designTitle = nativeWebRequest.getParameter("designTitle");
        String houseType = nativeWebRequest.getParameter("houseType");
        String showLevel = nativeWebRequest.getParameter("showLevel");
        String pageStart = nativeWebRequest.getParameter("pageStart");
        String pageSize = nativeWebRequest.getParameter("pageSize");
        String orderMethod = nativeWebRequest.getParameter("orderMethod");
        String code = nativeWebRequest.getParameter("code");
        String hprice = nativeWebRequest.getParameter("hprice");
        String lprice = nativeWebRequest.getParameter("lprice");
        String minArea = nativeWebRequest.getParameter("minArea");
        String maxArea = nativeWebRequest.getParameter("maxArea");
        DesignQueryCondition designQueryCondition = new DesignQueryCondition();
        String signIdsStr = nativeWebRequest.getParameter("signIds");
        String signIdsOrStr= nativeWebRequest.getParameter("signIdsOr");
        String designerId = nativeWebRequest.getParameter("designerId");
        String keywords = nativeWebRequest.getParameter("keywords");
        if(!StringUtils.isBlank(signIdsStr)){
            designQueryCondition.setSignIds(Arrays.asList(signIdsStr.split(",")));
        }
//        if(null!=signIds&&signIds.length>0){
//            designQueryCondition.setSignIds(Arrays.asList(signIds));
//        }
        if(!StringUtils.isBlank(code)){
            List<String> signIdsByCode =   wechatSysSignMapper.findSignIdsByCode(code);
            if(CollectionUtils.isNotEmpty(signIdsByCode)){
                designQueryCondition.setSignIds(signIdsByCode);
            }
        }
        if(!StringUtils.isBlank(signIdsOrStr)){
            designQueryCondition.setSignIdsOr(Arrays.asList(signIdsOrStr.split(",")));

        }
//        if(StringUtils.isNotBlank(category)){
//            designQueryCondition.setCategory(Enum.valueOf(WechatCategory.class, category));
//        }
        if(StringUtils.isNotBlank(showLevel)){
            designQueryCondition.setShowLevel(Enum.valueOf(DesignShowLevel.class,showLevel));
        }
//        if(StringUtils.isNotBlank(kindStr)){
//            designQueryCondition.setKind(Enum.valueOf(WechatKind.class, kindStr));
//        }
        if(StringUtils.isNotBlank(kindStr)){
            designQueryCondition.setKind(kindStr);
        }
        if(StringUtils.isNotBlank(orderMethod)){
            designQueryCondition.setOrderMethod(Enum.valueOf(OrderMethod.class,orderMethod));
        }
        designQueryCondition.setDesignNo(designNo);
        designQueryCondition.setDesignTitle(designTitle);
        designQueryCondition.setHouseType(houseType);
        designQueryCondition.setPageStart(Integer.parseInt(pageStart));
        designQueryCondition.setPageSize(Integer.parseInt(pageSize));
        designQueryCondition.setHprice(hprice);
        designQueryCondition.setLprice(lprice);
        designQueryCondition.setMinArea(minArea);
        designQueryCondition.setMaxArea(maxArea);
        designQueryCondition.setDesignerId(designerId);
        designQueryCondition.setKeywords(keywords);
        designQueryCondition.setUserLoginToken(u);
        return designQueryCondition;
    }
}
