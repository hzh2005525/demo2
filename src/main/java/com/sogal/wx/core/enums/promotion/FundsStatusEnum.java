package com.sogal.wx.core.enums.promotion;

import lombok.Getter;

@Getter
public enum FundsStatusEnum {

    NO_FUNDS("未请款", 0),
    FOR_FUNDS("请款中", 1),
    FUNDS_FAIL("请款失败", 2),
    FUNDS_SUCCESS("请款成功", 3);

    private final String message;
    private final int code;

    FundsStatusEnum(String message, int code) {
        this.message = message;
        this.code = code;
    }

}
