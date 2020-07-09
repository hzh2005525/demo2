package com.sogal.wx.core.enums.promotion;

import lombok.Getter;

@Getter
public enum IdentifyCardStatusEnum {

    NAME_AUTHING("实名认证中", 0),
    NAME_AUTH_FAIL("实名认证失败", 1),
    NAME_AUTH_SUCCESS("实名认证成功", 2),
    EXPIRED("已到期", 3);

    private final String message;
    private final int code;

    IdentifyCardStatusEnum(String message, int code) {
        this.message = message;
        this.code = code;
    }

}
