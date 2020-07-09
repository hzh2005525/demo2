package com.sogal.wx.core.dao.domain.expose;

import com.sogal.wx.core.dao.domain.base.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class UserExposeRewardCash extends BaseEntity {

    @ApiModelProperty("商户账号appid")
    private String mchAppid;

    @ApiModelProperty("商户号")
    private String mchid;

    @ApiModelProperty("随机字符串")
    private String nonceStr;

    @ApiModelProperty("提现金额")
    private BigDecimal cashAmount;

    @ApiModelProperty("状态,1:发放中;2:发放失败;3:发放成功")
    private Integer status;

    @ApiModelProperty("商户订单号")
    private String partnerTradeNo;

    @ApiModelProperty("用户openid")
    private String openid;

    @ApiModelProperty("企业付款备注")
    private String cashDesc;

    @ApiModelProperty("Ip地址")
    private String spbillCreateIp;

    @ApiModelProperty("微信错误代码")
    private String errCode;

    @ApiModelProperty("支付流水号")
    private String paymentNo;

    @ApiModelProperty("付款成功时间")
    private String paymentTime;

}
