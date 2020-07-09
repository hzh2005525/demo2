package com.sogal.wx.core.dao.domain.kitchen;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class AssignServiceStaffDTO {

    private String id;

    /**
     *服务人员名称
     */
    private String staffName;
    /**
     * 服务人员电话
     */
    private String staffMobile;

    /**
     * 计划上门时间
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date planServiceTime;


    /**
     * 服务商id
     */
    private String serviceProviderId;

    /**
     * 派工时填写备注
     */
    private String assignStaffRemark;

    private String positionId;
}
