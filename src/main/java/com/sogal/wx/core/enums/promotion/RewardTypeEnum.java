package com.sogal.wx.core.enums.promotion;

import lombok.Getter;

@Getter
public enum RewardTypeEnum {

    DEAL_REWARD("成交奖励", 0),
    MEASURE_REWARD("测量奖励", 1),
    GROUP_REWARD("团队奖励", 2);


    private final String message;
    private final int code;

    RewardTypeEnum(String message, int code) {
        this.message = message;
        this.code = code;
    }

}
