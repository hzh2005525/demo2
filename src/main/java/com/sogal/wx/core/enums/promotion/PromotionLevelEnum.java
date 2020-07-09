package com.sogal.wx.core.enums.promotion;

import lombok.Getter;

@Getter
public enum PromotionLevelEnum {

    LV0("青铜", "LV0"),
    LV1("白银", "LV1"),
    LV2("黄金", "LV2");

    private final String message;
    private final String code;

    PromotionLevelEnum(String message, String code) {
        this.message = message;
        this.code = code;
    }

}
