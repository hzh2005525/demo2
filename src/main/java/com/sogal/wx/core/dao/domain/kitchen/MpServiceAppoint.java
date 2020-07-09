package com.sogal.wx.core.dao.domain.kitchen;

import com.sogal.wx.core.dao.domain.base.BaseEntity;
import com.sogal.wx.core.dao.domain.service.MpServiceStage;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class MpServiceAppoint extends BaseEntity{
    /**
     * 服务单号
     */
    private String serviceAppointNo;

    /**
     * 优惠券id
     */
    private String couponId;
    /**
     * 用户userId
     */
    private String userId;
    /**
     * unionId
     */
    private String unionId;
    /**
     * 服务类别
     */
    private String serviceType;
    /**
     * 品牌单编号
     */
    private String orderNo;
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
     * 服务阶段
     */
    private MpServiceStage stage;
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
     *取消时间
     */
    private Date cancelTime;
    /**
     *取消预约原因
     */
    private String cancelReason;
    /**
     * 完成时间
     */
    private Date finishTime;
    /**
     *服务得分
     */
    private int evaluateScore;
    /**
     * 评价内容
     */
    private String evaluateContent;
    /**
     *评价时间
     */
    private Date evaluateTime;
    /**
     *受理(指派服务商)时间
     */
    private Date assignServiceProviderTime;
    /**
     *服务商ID
     */
    private String serviceProviderId;
    /**
     *选择服务商填写备注
     */
    private String assignProviderRemark;
    /**
     * 计划上门时间
     */
    private Date planServiceTime;
    /**
     *派工(指派上门服务的工作人员)时间
     */
    private Date assignStaffTime;
    /**
     * 服务商工作人员id
     */
    private String staffId;
    /**
     *服务人员
     */
    private String staffName;
    /**
     *服务人员电话
     */
    private String staffMobile;

    /**
     * 派工时填写备注
     */
    private String assignStaffRemark;

    /**
     * 变更上门时间填写原因
     */
    private String changeServiceTimeReason;

}
