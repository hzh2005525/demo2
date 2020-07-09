package com.sogal.wx.core.annotation.processor;

import com.sogal.wx.core.annotation.MyRecord;
import com.sogal.wx.core.dao.domain.base.FissionMeThod;
import com.sogal.wx.core.dao.domain.base.WechatCategory;
import com.sogal.wx.core.dao.domain.mine.MyRecordDTO;
import com.sogal.wx.core.dao.domain.promotion.UserBasicInfo;
import com.sogal.wx.core.dao.domain.user.UserLoginToken;
import com.sogal.wx.core.dao.mapper.MySharerMapper;
import com.sogal.wx.core.dao.mapper.MyVisitorMapper;
import com.sogal.wx.core.dao.mapper.UserMpMapper;
import com.sogal.wx.core.fission.FissionConfigService;
import com.sogal.wx.core.tool.DateTool;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiaoxuwang on 2019/4/25.
 */
@Component
public class MyRecordProcessor implements HandlerMethodArgumentResolver {


    @Autowired
    private AppletLoginHandlerProcessor appletLoginHandlerProcessor;

    @Autowired
    private FissionConfigService fissionConfigService;

    @Autowired
    private MyVisitorMapper myVisitorMapper;

    @Autowired
    private MySharerMapper mySharerMapper;

    @Autowired
    private UserMpMapper userMpMapper;

    private static final String datePattern = "yyyy-MM-dd";

    @Override
    public boolean supportsParameter(MethodParameter methodParameter) {
        return MyRecordDTO.class.isAssignableFrom(methodParameter.getParameterType())&&
                methodParameter.hasParameterAnnotation(MyRecord.class);
    }

    @Override
    public Object resolveArgument(MethodParameter methodParameter, ModelAndViewContainer modelAndViewContainer,
                                  NativeWebRequest nativeWebRequest, WebDataBinderFactory webDataBinderFactory)
            throws Exception {
        Object o = appletLoginHandlerProcessor.resolveArgument(methodParameter, modelAndViewContainer, nativeWebRequest, webDataBinderFactory);
        if(null == o) {
            return null;
        }
        UserLoginToken u = (UserLoginToken)o;
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

        MyRecordDTO dto = new MyRecordDTO();
        String today = DateTool.TODAY.getDate(datePattern);
        String time = nativeWebRequest.getParameter("time");
        if(StringUtils.isBlank(time)){
            time = "LAST_YEAR";
        }
        DateTool dateTool = Enum.valueOf(DateTool.class, time);
        time = dateTool.getDate(datePattern);
        if(DateTool.YESTERDAY.equals(dateTool)){
            today = time;
        }else if(DateTool.LAST_YEAR.equals(dateTool)){
            today = DateTool.TOMORROW.getDate(datePattern);
        }
        dto.setEndTime(today + " 23:59:59");
        dto.setStartTime(time + " 00:00:00");
        String id = WechatCategory.MEIJIA.equals(category) ? userBasicInfo.getId() : u.getWechatUser().getId();
        String userNo = WechatCategory.MEIJIA.equals(category) ? userBasicInfo.getUserNo() : u.getWechatUser().getUserNo();
        dto.setServent(userNo);
        dto.setServentId(id);
        List<String> userIds = new ArrayList<>();
        String currentFissionMehod =  fissionConfigService.getCurrentFissionMehod();
        if(FissionMeThod.FIRST.name().equals(currentFissionMehod)){
             userIds = mySharerMapper.findMyUserIdsAsFirstReferrer(id);
        }else if(FissionMeThod.LAST.name().equals(currentFissionMehod)){
             userIds = myVisitorMapper.findMyVisitorIds(dto);
        }
        if(CollectionUtils.isEmpty(userIds)){
            return null;
        }
        String visitorId = nativeWebRequest.getParameter("visitorId");
        dto.setVisitorId(visitorId);
        dto.setCustomer(userIds);
        dto.setCategory(u.getWechatUser().getCategory());
        return dto;
    }
}
