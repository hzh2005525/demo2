package com.sogal.wx.core.enums.promotion;

import lombok.Getter;

@Getter
public enum AuditStatusEnum {

    NO_AUDIT("待审核", 0),
    AUDIT_PASS("审核通过", 1),
    AUDIT_REJECT("审核拒绝", 2);


    private final String message;
    private final int code;

    AuditStatusEnum(String message, int code) {
        this.message = message;
        this.code = code;
    }

}
