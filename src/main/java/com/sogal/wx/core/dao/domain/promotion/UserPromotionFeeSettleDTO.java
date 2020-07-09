package com.sogal.wx.core.dao.domain.promotion;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Map;

@Data
public class UserPromotionFeeSettleDTO extends UserPromotionFeeSettle {

    @ApiModelProperty("结算时间")
    private String settleAccountTime;

    @ApiModelProperty("reasonObject")
    private Map<String, Object> reasonObject;

}
