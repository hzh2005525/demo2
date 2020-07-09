package com.sogal.wx.core.dao.domain.promotion;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class UserPromotionRewardQueryCondition {

    @ApiModelProperty("用户编号")
    private String unionId;

    @ApiModelProperty("当前年月")
    private String currentYears;

    @ApiModelProperty(hidden = true)
    private Integer year;

    @ApiModelProperty(hidden = true)
    private Integer month;

}
