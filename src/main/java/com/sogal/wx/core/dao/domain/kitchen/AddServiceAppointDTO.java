package com.sogal.wx.core.dao.domain.kitchen;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class AddServiceAppointDTO{

    /**
     * 服务类别
     */
    private String serviceType;

    /**
     * 联系人姓名
     */
    private String contactName;
    /**
     * 联系人电话
     */
    private String contactMobile;
    /**
     * 地址
     */
    private String address;

    /**
     * 预约时间
     */
    private Date appointTime;
    /**
     * 预约时间段
     */
    private String appointTimeRange;
    /**
     * 备注
     */
    private String remark;

    /**
     * 券id
     */
    private String couponId;


}
