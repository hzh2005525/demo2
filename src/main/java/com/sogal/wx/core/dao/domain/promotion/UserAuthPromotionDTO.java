package com.sogal.wx.core.dao.domain.promotion;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class UserAuthPromotionDTO extends UserAuthPromotion {

    @ApiModelProperty("微信code")
    private String code;

    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty("历史手机号")
    private String historicMobile;

    @ApiModelProperty("用户编号")
    private String userNo;

    @ApiModelProperty("银行卡状态")
    private Integer bankStatus;

}
