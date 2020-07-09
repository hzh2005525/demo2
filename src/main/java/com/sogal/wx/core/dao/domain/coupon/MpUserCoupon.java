package com.sogal.wx.core.dao.domain.coupon;

import com.sogal.wx.core.dao.domain.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MpUserCoupon extends BaseEntity{

    /**
     * 用户id
     */
    private String userId;

    /**
     * 领取优惠券所用手机号
     */
    private String mobile;

    /**
     * 优惠券id
     */
    private String couponId;


    /**
     * dsp客户id
     */
    private String custId;



}
