package com.sogal.wx.core.enums.promotion;

import lombok.Getter;

@Getter
public enum MonthRewardStatusEnum {

    NO_SETTLE("未结算", 0),
    SETTLED("已结算", 1),
    CASHED("已提现", 2),
    CASH_FAIL("提现失败", 3),
    CASH_SUCCESS("提现成功", 4);


    private final String message;
    private final int code;

    MonthRewardStatusEnum(String message, int code) {
        this.message = message;
        this.code = code;
    }

}
