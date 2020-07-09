package com.sogal.wx.core.enums.promotion;

import lombok.Getter;

@Getter
public enum ContractStatusEnum {
    NO_SIGN("未签署", -1),
    IN_AUDIT("审核中", 0),
    IN_EFFECTIVE("生效中", 1),
    REJECT("驳回", 2),
    EXPIRED("已过期", 3),
    FAILURE("已失效", 4),
    TERMINATED("已终止", 5);

    private final String message;
    private final int code;

    ContractStatusEnum(String message, int code) {
        this.message = message;
        this.code = code;
    }

}
