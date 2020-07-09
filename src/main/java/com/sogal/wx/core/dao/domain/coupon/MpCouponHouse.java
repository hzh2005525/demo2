package com.sogal.wx.core.dao.domain.coupon;

import com.sogal.wx.core.dao.domain.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class MpCouponHouse extends BaseEntity{


    /**
     * 优惠券id
     */
    private String couponId;


    /**
     * dsp客户id
     */
    private String custId;


    /**
     * dsp客户姓名
     */
    private String custName;
    /**
     * dsp客户电话
     */
    private String custMobile;

    /**
     * 房屋地址
     */
    private String houseAddr;

    /**
     * 房屋id
     */
    private String houseId;

    /**
     * 订单号
     */
    private String orderNo;



}
