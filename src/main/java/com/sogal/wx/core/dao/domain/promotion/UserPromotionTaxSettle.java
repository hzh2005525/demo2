package com.sogal.wx.core.dao.domain.promotion;

import com.sogal.wx.core.dao.domain.base.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class UserPromotionTaxSettle extends BaseEntity {

    @ApiModelProperty("姓名")
    private String name;

    @ApiModelProperty("身份证")
    private String identityCode;

    @ApiModelProperty("手机号")
    private String mobile;

    @ApiModelProperty("发放金额")
    private BigDecimal labourFee;

    @ApiModelProperty("实际发放金额")
    private BigDecimal grantFee;

    @ApiModelProperty("报税基数")
    private BigDecimal taxPayBase;

    @ApiModelProperty("增值税金额")
    private BigDecimal vatFee;

    @ApiModelProperty("附加税金额")
    private BigDecimal surtaxFee;

    @ApiModelProperty("个人所得税金额")
    private BigDecimal pertaxFee;

    @ApiModelProperty("交易时间")
    private String payTime;

    @ApiModelProperty("支付状态")
    private Integer status;

    @ApiModelProperty("报税期间")
    private String taxPeriod;

    @ApiModelProperty("完税附件信息")
    private List<UserPromotionTaxEnclosure> taxVoucher;

}
