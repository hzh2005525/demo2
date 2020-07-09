package com.sogal.wx.core.dao.domain.promotion;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDate;

@Data
public class UserPromotionDayRewardDTO extends UserPromotionDayReward {

    @ApiModelProperty("客户名称")
    private String name;

    @ApiModelProperty("手机号")
    private String mobile;

    @ApiModelProperty("地址")
    private String addr;

    @ApiModelProperty("预计到账时间")
    private LocalDate accountDate;

    @ApiModelProperty("状态,0:未结算;1:已结算;2:已提现")
    private Integer status;

    @ApiModelProperty("用户信息")
    private UserBasicInfo userInfo;

}
