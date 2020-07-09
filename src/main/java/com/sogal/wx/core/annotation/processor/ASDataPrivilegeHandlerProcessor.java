package com.sogal.wx.core.annotation.processor;

import com.google.gson.Gson;
import com.sogal.common.domain.ComFinalParams;
import com.sogal.common.domain.user.UserDTO;
import com.sogal.common.util.JedisUtil;
import com.sogal.common.util.JsonUtil;
import com.sogal.wx.core.annotation.ASDataPrivilegeInfo;
import com.sogal.wx.core.dao.domain.position.MpDataPrivilegeType;
import com.sogal.wx.core.dao.domain.position.UserASDataPrivilege;
import com.sogal.wx.core.dao.domain.service.MpServiceStaffDTO;
import com.sogal.wx.core.dao.mapper.MpServiceStaffMapper;
import com.sogal.wx.core.dao.mapper.MpStaffPositionMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 *  @Author : zhaojie
 *  @Description :
 *  @Date : 2020/1/13
 */
@Component
public class ASDataPrivilegeHandlerProcessor implements HandlerMethodArgumentResolver{

    public static final String TOKEN_HEAD = "token";


    @Autowired
    private MpServiceStaffMapper mpServiceStaffMapper;

    @Autowired
    private MpStaffPositionMapper mpStaffPositionMapper;

    @Autowired
    private JedisUtil jedisUtil;

    @Autowired
    private Gson gson;

    @Override
    public boolean supportsParameter(MethodParameter methodParameter) {
        return UserASDataPrivilege.class.isAssignableFrom(methodParameter.getParameterType())&&
                methodParameter.hasParameterAnnotation(ASDataPrivilegeInfo.class);
    }

    @Override
    public Object resolveArgument(MethodParameter methodParameter, ModelAndViewContainer modelAndViewContainer,
                                  NativeWebRequest nativeWebRequest, WebDataBinderFactory webDataBinderFactory)
            throws Exception {
        HttpServletRequest request = nativeWebRequest.getNativeRequest(HttpServletRequest.class);
        String token = request.getHeader(TOKEN_HEAD);
        if(StringUtils.isBlank(token)){
            Cookie[] cookies = request.getCookies();
            if(cookies != null){
                for(Cookie cookie:cookies){
                    if(TOKEN_HEAD.equals(cookie.getName())){
                        token = cookie.getValue();
                        break;
                    }
                }
                if (StringUtils.isBlank(token)){
                    token = request.getParameter(TOKEN_HEAD);
                }
            }
        }
        token = ComFinalParams.TOKEN_TAG + token;
//        log.info("token="+token);
        String json = jedisUtil.get(token);
//        log.info("json="+json);
        Map map = JsonUtil.fromJson(json, HashMap.class);
        if (map == null) {
            return null;
        }
        map.remove("primaryPosition");
        map.remove("$ttl");
        map.remove("lastLoginTime");
        UserDTO user = JsonUtil.fromJson(JsonUtil.beanToJson(map), UserDTO.class);
        UserASDataPrivilege userASDataPrivilege = mpStaffPositionMapper.findUserDataPrivilegeById(user.getId());
        if(null != userASDataPrivilege){
            if(MpDataPrivilegeType.I.getCode().equals(userASDataPrivilege.getDataPrivilege())){
                userASDataPrivilege.setMobile(user.getMobile());
            }else if(MpDataPrivilegeType.DEPARTMENT.getCode().equals(userASDataPrivilege.getDataPrivilege())){
                MpServiceStaffDTO mpServiceStaffDTO = mpServiceStaffMapper.findASStaffInfoByMobile(user.getMobile());
                userASDataPrivilege.setProviderId(mpServiceStaffDTO == null ? null:mpServiceStaffDTO.getProviderId());
            }
        }else {
            userASDataPrivilege = new UserASDataPrivilege();
            userASDataPrivilege.setMobile(user.getMobile());
        }
        return userASDataPrivilege;
    }
}
