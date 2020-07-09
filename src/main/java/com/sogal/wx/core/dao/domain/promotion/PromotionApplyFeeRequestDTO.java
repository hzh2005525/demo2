package com.sogal.wx.core.dao.domain.promotion;

import com.google.gson.annotations.Expose;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class PromotionApplyFeeRequestDTO {

    @ApiModelProperty("月奖励id")
    private String id;

    @ApiModelProperty("姓名")
    @Expose
    private String name;

    @ApiModelProperty("证件类型")
    @Expose
    private String identityType;

    @ApiModelProperty("身份证")
    @Expose
    private String identityCode;

    @ApiModelProperty("手机号")
    @Expose
    private String mobile;

    @ApiModelProperty("银行卡")
    @Expose
    private String accountNo;

    @ApiModelProperty("银行名称")
    @Expose
    private String accountBank;

    @ApiModelProperty("发放金额")
    @Expose
    private BigDecimal labourFee;

    @ApiModelProperty("批次号")
    @Expose
    private String batchNum;

    @ApiModelProperty("客户业务编号（唯一）")
    @Expose
    private String targetServiceNo;

    @ApiModelProperty("提现时间（服务时间)(格式:yyyy-MM-dd HH:mm:ss)为空则默认为接收到请求的时间")
    @Expose
    private String serviceTime;

}
