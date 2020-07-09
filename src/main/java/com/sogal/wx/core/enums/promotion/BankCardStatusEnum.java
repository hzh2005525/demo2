package com.sogal.wx.core.enums.promotion;

import lombok.Getter;

@Getter
public enum BankCardStatusEnum {

    NO_CARD_BINDING("未绑卡", 0),
    CARD_BINDING("已绑卡", 1);

    private final String message;
    private final int code;

    BankCardStatusEnum(String message, int code) {
        this.message = message;
        this.code = code;
    }

}
