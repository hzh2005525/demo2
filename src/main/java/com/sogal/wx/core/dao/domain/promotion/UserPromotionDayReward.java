package com.sogal.wx.core.dao.domain.promotion;

import com.sogal.wx.core.dao.domain.base.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class UserPromotionDayReward extends BaseEntity {

    @ApiModelProperty("创薪unionId")
    private String unionId;

    @ApiModelProperty("贡献者id")
    private String devoteId;

    @ApiModelProperty("奖励类型,0:成交奖励;1:测量奖励;2:团队奖励")
    private Integer rewardType;

    @ApiModelProperty("奖励额")
    private BigDecimal rewardAmount;

    @ApiModelProperty("成交额")
    private BigDecimal dealAmount;

    @ApiModelProperty("计算条件")
    private String calculateFactor;

    @ApiModelProperty("带单数")
    private Integer orderNum;

    @ApiModelProperty("年")
    private Integer currentYear;

    @ApiModelProperty("月")
    private Integer currentMonth;

    @ApiModelProperty("当前级别,LV0:青铜;LV1:白银;LV2:黄金")
    private String currentLevel;

    @ApiModelProperty("房屋id")
    private String houseId;

    @ApiModelProperty("奖励时间")
    private LocalDateTime rewardTime;

}
