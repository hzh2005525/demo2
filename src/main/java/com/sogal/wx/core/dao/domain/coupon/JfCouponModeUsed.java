package com.sogal.wx.core.dao.domain.coupon;

import lombok.Getter;

@Getter
public enum JfCouponModeUsed {

    SELF("自己"),
    STAFF("工作人员");


    private final String name;

    JfCouponModeUsed(String name){
        this.name = name;
    }

}
