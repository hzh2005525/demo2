package com.sogal.wx.core.dao.domain.user;

import lombok.Getter;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;

@Getter
public enum InvalidReason {
    REITERATED("在您推荐之前，此客户已经在索菲亚订单中，属于重复推荐，不计作您的推广客户。"),
    BuyCompetingProducts("已购买竞品"),
    CustomerMobileError("客户手机号错误"),
    NoOrderIntention("无订购意向"),
    PoorProductTechnology("产品工艺不好"),
    Overpriced("价格过高"),
    ServiceExperienceDifference("服务体验不好"),
    NotSatisfiedWithDesign("设计不满意"),
    NoContactWithCustomers("联系不到客户"),
    NoCustomerStyle("无客户需求的产品风格"),
    InvalidCustomer("无效客户");

    private  final  String desc;

    InvalidReason(String desc){
        this.desc = desc;
    }

    public static boolean belongInvalidReasonEnum(String invalidReasonStr){
        if(StringUtils.isBlank(invalidReasonStr)){
            return false;
        }
        List<InvalidReason> invalidReasonsList = Arrays.asList(InvalidReason.values());
        if(CollectionUtils.isEmpty(invalidReasonsList)){
            return false;
        }
        for(InvalidReason invalidReason : invalidReasonsList){
            if(invalidReason.name().equals(invalidReasonStr)){
                return true;
            }
        }
        return false;
    }
}
