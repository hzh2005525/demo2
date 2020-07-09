package com.sogal.wx.core.dao.domain.promotion;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class UserAuthPromotionQueryCondition {

    @ApiModelProperty(value = "审核状态,0:待审核;1:审核通过;2:审核不通过")
    private Integer category = 0;

    @ApiModelProperty(value = "合伙人")
    private String promotionName;

    @ApiModelProperty(value = "推荐人")
    private String recommendName;

    @ApiModelProperty(value = "开始日期")
    private String startDate;

    @ApiModelProperty(value = "结束日期")
    private String endDate;

    @ApiModelProperty("级别,LV0:青铜;LV1:白银;LV2:黄金")
    private String level;

    @ApiModelProperty("用户编号")
    private String userNo;

}
