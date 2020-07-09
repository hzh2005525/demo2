package com.sogal.wx.core.dao.domain.kitchen;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Setter
@Getter
public class QueryServiceAppointCondition {

    private String stage;


    private List<String> stages;

    /**
     * 服务单号
     */
    private String serviceAppointNo;

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
     *服务商ID
     */
    private String serviceProviderId;


    /**
     * 服务商工作人员id
     */
    private String staffId;

    /**
     * 服务商工作人员电话
     */
    private String staffMobile;

    /**
     * 评价得分等级
     */
    private Integer evaluateScore;

    /**
     * （查询）用户预约上门时间(起)
     */
    private Date appointTimeBegin;

    /**
     * （查询）用户预约上门时间(止)
     */
    private Date appointTimeTimeEnd;


    /**
     * （查询）计划上门时间(起)
     */
    private Date planServiceTimeBegin;

    /**
     * （查询）计划上门时间(止)
     */
    private Date planServiceTimeEnd;

    /**
     * （查询）派工时间(起)
     */
    private Date assignStaffTimeBegin;

    /**
     * （查询）派工时间(止)
     */
    private Date assignStaffTimeEnd;

    /**
     * （查询）交单时间(起)
     */
    private Date finishTimeBegin;

    /**
     * （查询）交单时间(止)
     */
    private Date finishTimeEnd;

    /**
     * （查询）评价时间(起)
     */
    private Date evaluateTimeBegin;

    /**
     * （查询）评价时间(止)
     */
    private Date evaluateTimeEnd;

    /**
     * （查询）取消时间(起)
     */
    private Date cancelTimeBegin;

    /**
     * （查询）取消时间(止)
     */
    private Date cancelTimeEnd;


}
