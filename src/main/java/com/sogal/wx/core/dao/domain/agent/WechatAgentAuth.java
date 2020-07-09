package com.sogal.wx.core.dao.domain.agent;

import com.sogal.common.domain.activiti.ProcessStatus;
import com.sogal.common.domain.cooperator.CooperatingState;
import com.sogal.common.domain.cooperator.CooperatorType;
import com.sogal.common.domain.dealer.EmpStatus;
import com.sogal.wx.core.dao.domain.base.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author hzh
 * @date 2019-08-12
 * @description v1.6经销商认证实体bean
 */
@Data
public class WechatAgentAuth extends BaseEntity {

    @ApiModelProperty("姓名")
    private String name;

    @ApiModelProperty("手机号")
    private String mobile;

    @ApiModelProperty("部门/门店/公司")
    private String company;

    @ApiModelProperty("经销商")
    private String agent;

    @ApiModelProperty("来源")
    private String source;

    @ApiModelProperty("备注")
    private String remarks;

    @ApiModelProperty("类别,0:四地员工; 1:北京员工; 2:四地合作方; 3:北京合作方; 4:其它")
    private Integer category;

    @ApiModelProperty("北京员工状态")
    private EmpStatus pkStatus;

    @ApiModelProperty("北京合作方类型")
    private CooperatorType pkCooperatorType;

    @ApiModelProperty("北京合作方审批状态")
    private ProcessStatus pkApprovalStatus;

    @ApiModelProperty("北京合作方合作状态")
    private CooperatingState pkCooperatingState;

}
