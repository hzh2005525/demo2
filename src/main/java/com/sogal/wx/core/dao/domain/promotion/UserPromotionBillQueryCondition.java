package com.sogal.wx.core.dao.domain.promotion;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class UserPromotionBillQueryCondition {

    @ApiModelProperty("当前年月")
    private String currentYears;

}
