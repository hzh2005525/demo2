package com.sogal.wx.core.dao.domain.promotion;

import com.sogal.wx.core.dao.domain.base.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class UserPromotionTaxEnclosure extends BaseEntity {

    @ApiModelProperty("结算完税id")
    private String taxSettleId;

    @ApiModelProperty("完税凭证编号")
    private String invoiceNo;

    @ApiModelProperty("完税凭证字规")
    private String invoiceZg;

    @ApiModelProperty("完税凭证附件地址")
    private String yunUrl;

    @ApiModelProperty("完税凭证类型（国、地）")
    private String taxType;

}
