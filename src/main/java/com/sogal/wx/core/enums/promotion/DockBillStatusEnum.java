package com.sogal.wx.core.enums.promotion;

import lombok.Getter;

@Getter
public enum DockBillStatusEnum {

    NO_DOCK_BILL("未对账", 0),
    DOCK_BILL_FAIL("对账失败", 1),
    DOCK_BILL_SUCCESS("对账成功", 2);


    private final String message;
    private final int code;

    DockBillStatusEnum(String message, int code) {
        this.message = message;
        this.code = code;
    }

}
