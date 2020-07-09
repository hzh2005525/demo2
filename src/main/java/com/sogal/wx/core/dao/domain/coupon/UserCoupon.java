package com.sogal.wx.core.dao.domain.coupon;

import com.sogal.common.util.StringUtil;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserCoupon {
    /**
     * uuid主键
     */
    private String id;

    /**
     * 小程序用户id
     */
    private String userId;

    /**
     * 用户unionId
     */
    private String unionId;

    /**
     * 用户领取优惠券所用手机号
     */
    private String mobile;

    /**
     * dsp客户id
     */
    private String custId;


    /**
     * 优惠券ID
     */
    private String couponId;

    /**
     * 优惠券状态
     */
    private String status;

    private String matchId;

    private String qrId;

    private String couponType;

    private String sourceType;

    public UserCoupon(){
        this.id = StringUtil.uuid();
    }
}
