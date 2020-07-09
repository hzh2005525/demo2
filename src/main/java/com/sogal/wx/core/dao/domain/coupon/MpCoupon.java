package com.sogal.wx.core.dao.domain.coupon;

import com.sogal.common.util.StringUtil;
import com.sogal.wx.core.dao.domain.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class MpCoupon  extends BaseEntity{

    /**
     * 优惠券名称
     */
    private String name;
    /**
     * 优惠券类型
     */
    private String type;
    /**
     * 是否有效
     */
    private Boolean valid;
    /**
     * 发布状态
     */
    private String publishStatus;

    /**
     * 使用状态
     */
    private MpCouponStatus status;

    /**
     * 发放原因
     */
    private String issueReason;
    /**
     * 券使用开始时间
     */
    private Date availableBeginTime;
    /**
     * 券使用截止时间
     */
    private Date availableEndTime;

    /**
     * 使用地址是否锁定
     */
    private Boolean addrLocked;
    /**
     * 券介绍（补充）说明
     */
    private String instruction;
    /**
     * 发放渠道
     */
    private String distributionChannel;

    /**
     * 小程序用户id
     */
    private String userId;

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
     * 最近修改人
     */
    private String updator;

    /**
     * 用户领取优惠券所用手机号
     */
    private String mobile;


    private String use_addr_range;



}
