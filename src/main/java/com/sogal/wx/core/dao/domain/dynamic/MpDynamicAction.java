package com.sogal.wx.core.dao.domain.dynamic;


import com.sogal.common.domain.BaseEnum;
import com.sogal.common.domain.Realm;
import com.sogal.common.util.ListUtil;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;

/**
 * 跟进动作
 */
@Getter
public enum MpDynamicAction implements BaseEnum {
    USER_APPOINT_SERVICE("用户预约服务",MpDynamicRealm.KITCHEN_NURSE,"用户预约 %1s 成功，预约服务日期：%2s，时间段：%3s，备注：%4s，等待受理"),
    APPOINT_SERVICE("预约服务",MpDynamicRealm.KITCHEN_NURSE,"预约 %1s 成功,指定服务商为 %2s,计划上门服务时间 %3s，备注：%4s，等待派工"),
    ACCEPT_SERVICE_APPOINT("受理服务预约",MpDynamicRealm.KITCHEN_NURSE,"受理 %1s 成功,服务商为 %2s,计划上门服务时间 %3s"),
    CHANGE_SERVICE_PROVIDER("变更服务商",MpDynamicRealm.KITCHEN_NURSE,"进行变更服务商操作,将服务商从 %1s 变更为 %2s"),
    ASSIGN_STAFF("派工",MpDynamicRealm.KITCHEN_NURSE,"进行派工操作,派工给 %1s,备注：%2s。"),
    REASSIGN_STAFF("重新派工",MpDynamicRealm.KITCHEN_NURSE,"进行重新派工操作,派工给 %1s,备注：%2s。"),
    CANCEL_SERVICE_APPOINT("取消服务预约",MpDynamicRealm.KITCHEN_NURSE,"进行取消服务预约操作,取消 %1s 预约，取消原因： %2s"),
    USER_CANCEL_SERVICE_APPOINT("用户取消服务预约",MpDynamicRealm.KITCHEN_NURSE,"进行取消服务预约操作,用户取消 %1s 预约"),
    USER_EVALUATE_SERVICE("用户评价服务预约",MpDynamicRealm.KITCHEN_NURSE,"用户对服务 %1s 进行评价操作，评价结果：%2s"),

    CHANGE_SERVICE_TIME("变更服务上门时间",MpDynamicRealm.KITCHEN_NURSE,"进行变更上门时间操作,将上门服务时间从 %1s 变更为 %2s,变更原因：%3s");


    private String message;

    private MpDynamicRealm realm;

    private String content;

    private boolean filter;

    private boolean artificial;

    private MpDynamicAction(String message, MpDynamicRealm realm, String content) {
        this.message = message;
        this.realm = realm;
        this.content = content;
    }



    public static List<MpDynamicAction> getSharingDynamicActions() {
        return ListUtil.filter(Arrays.asList(MpDynamicAction.values()), (i) -> !i.filter);
    }

    public String getCode() {
        return this.name();
    }
}
