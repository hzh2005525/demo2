package com.sogal.wx.core.dao.domain.coupon;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @description:
 * @author: Liutl
 * @time: 2020/3/9 23:42
 */
@Data
public class MyCoupon {

    private String id;
    //优惠劵类型
    private String couponType;
    //优惠值
    private BigDecimal discount;
    //优惠条件
    private String discountcon;
    //有效期类型
    private String validType;
    //有效期时间
    private String validDate;
    //有效期单位
    private String validDateUnit;
    //创建日期
    private String timeCreated;
    //到期时间
    private String expiredDate;
    //优惠券状态
    private String status;
}
