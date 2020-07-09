package com.sogal.wx.core.enums.promotion;

import lombok.Getter;

@Getter
public enum AutoEvictEnum {

    NO_EVICT("未解除", 0),
    EVICTED("已解除", 1);

    private final String message;
    private final int code;

    AutoEvictEnum(String message, int code) {
        this.message = message;
        this.code = code;
    }

}
