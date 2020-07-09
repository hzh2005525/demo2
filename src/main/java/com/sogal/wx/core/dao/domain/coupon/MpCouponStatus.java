package com.sogal.wx.core.dao.domain.coupon;

import lombok.Getter;
import lombok.Setter;

@Getter
public enum MpCouponStatus {

    NEW("未使用"),
    USED("已使用"),
    EXPIRED("已过期");


    private final String name;

    MpCouponStatus(String name){
        this.name = name;
    }

}
