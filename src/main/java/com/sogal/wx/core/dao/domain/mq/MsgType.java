package com.sogal.wx.core.dao.domain.mq;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;


@Getter
public enum MsgType {

    PROMOTE_CUST ("升级为客户"),
    USER_FILL_INFO("用户填写报名信息"),
    USER_PER_INFO("访客完善信息升级用户级别"),
    CUST_ASSOCIATE_WITH_USER("dsp客户关联c端客户"),
    USER_REQUIRE("用户提交的需求"),
    INVALID_ENROLL("无效的报名"),
    GENERATE_SERVICE_COUPON("生成服务优惠券"),
    IP_LOCATE("IP定位处理");

    private final String desc;

    MsgType(String desc){
        this.desc = desc;
    }

    private static Map<String, MsgType> messageTypeMap = new HashMap<String, MsgType>();

    static {
        for(MsgType e : MsgType.values()){
            messageTypeMap.put(e.name(), e);
        }
    }

    public static MsgType getMessageTypeMap(String action) {
        return messageTypeMap.get(action);
    }

}
