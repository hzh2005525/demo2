package com.sogal.wx.core.dao.domain.expose;

import com.google.common.collect.Lists;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class WaitExposeReward {

    @ApiModelProperty("活动id")
    private String activityId;

    @ApiModelProperty("提现金额")
    private BigDecimal cashAmount = BigDecimal.ZERO;

    @ApiModelProperty("曝光奖励明细id")
    private List<String> ids = Lists.newArrayList();

}
