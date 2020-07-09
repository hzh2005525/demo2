package com.sogal.wx.core.dao.domain.service;

import com.sogal.wx.core.dao.domain.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class MpServiceStaff extends BaseEntity{

    /**
     * 服务商工人名称
     */
    private String name;

    /**
     * 服务商工人电话
     */
    private String mobile;
    /**
     * 服务商工人状态
     */
    private String status;
    /**
     * 无效时间
     */
    private Date invalidTime;

    private String positionId;
}
