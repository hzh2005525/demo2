package com.sogal.wx.core.enums.promotion;

import lombok.Getter;

@Getter
public enum IdCardSideEnum {

    FRONT("正面", "front"),
    BACK("反面", "back");

    private final String message;
    private final String code;

    IdCardSideEnum(String message, String code) {
        this.message = message;
        this.code = code;
    }

}
