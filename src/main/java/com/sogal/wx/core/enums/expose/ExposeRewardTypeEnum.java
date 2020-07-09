package com.sogal.wx.core.enums.expose;

import lombok.Getter;

@Getter
public enum ExposeRewardTypeEnum {

    RANDOM("随机奖励", 1),
    FIX("固定奖励", 2);

    private final String message;
    private final int code;

    ExposeRewardTypeEnum(String message, int code) {
        this.message = message;
        this.code = code;
    }

}
