package com.sogal.wx.core.enums.promotion;

import lombok.Getter;

@Getter
public enum AuthStatusEnum {

    NO_AUTH("未认证", 0),
    AUTH("已认证", 1);


    private final String message;
    private final int code;

    AuthStatusEnum(String message, int code) {
        this.message = message;
        this.code = code;
    }

}
