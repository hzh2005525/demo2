package com.sogal.wx.core.dao.domain.promotion;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class UserPromotionSocialQueryCondition {

    @ApiModelProperty(value = "财务状态,0:应付款;1:处理中;2:已付款")
    private Integer type = 0;

    @ApiModelProperty("当前年月")
    private String currentYears;

}
