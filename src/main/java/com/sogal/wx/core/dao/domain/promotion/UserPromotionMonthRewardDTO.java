package com.sogal.wx.core.dao.domain.promotion;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Data
public class UserPromotionMonthRewardDTO extends UserPromotionMonthReward {

    @ApiModelProperty("奖励类型,0:成交奖励;1:测量奖励;2:团队奖励")
    private Integer rewardType;

    @ApiModelProperty("奖励额")
    private BigDecimal rewardAmount;

    @ApiModelProperty("注册名称")
    private String name;

    @ApiModelProperty("手机号")
    private String mobile;

    @ApiModelProperty("级别,LV0:青铜;LV1:白银;LV2:黄金")
    private String level;

    @ApiModelProperty("预计到账时间")
    private LocalDate accountDate;

    @ApiModelProperty("用户信息")
    private UserBasicInfo userInfo;

    @ApiModelProperty("获客数")
    private int count;

    @ApiModelProperty("银行卡")
    private String accountNo;

    @ApiModelProperty("银行")
    private String accountBank;

    @ApiModelProperty("月账单明细")
    private List<UserPromotionDayRewardDTO> list;

}
