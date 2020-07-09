package com.sogal.wx.core.dao.domain.promotion;

import com.sogal.wx.core.dao.domain.base.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class UserPromotionFeeSettle extends BaseEntity {

    @ApiModelProperty("月奖励id")
    private String monthRewardId;

    @ApiModelProperty("批次号")
    private String batchNum;

    @ApiModelProperty("人员结算编号")
    private String bourEmpNo;

    @ApiModelProperty("客户业务编号")
    private String targetServiceNo;

    @ApiModelProperty("姓名")
    private String name;

    @ApiModelProperty("身份证")
    private String identityCode;

    @ApiModelProperty("手机号")
    private String mobile;

    @ApiModelProperty("银行卡")
    private String accountNo;

    @ApiModelProperty("银行")
    private String accountBank;

    @ApiModelProperty("发放金额")
    private BigDecimal labourFee;

    @ApiModelProperty("实际发放金额")
    private BigDecimal grantFee;

    @ApiModelProperty("服务费(包括手续费)")
    private BigDecimal serviceFee;

    @ApiModelProperty("支付状态")
    private Integer payStatus;

    @ApiModelProperty("交易时间")
    private String payTime;

    @ApiModelProperty("交易信息")
    private String remark;

    @ApiModelProperty("状态,0:未对账;1:对账失败;2:对账成功")
    private Integer billStatus;

    @ApiModelProperty("对账失败原因")
    private String billFailReason;

    @ApiModelProperty("备注")
    private String targetRemark;

}
