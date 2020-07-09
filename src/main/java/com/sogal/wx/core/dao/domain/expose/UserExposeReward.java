package com.sogal.wx.core.dao.domain.expose;

import com.sogal.wx.core.dao.domain.base.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class UserExposeReward extends BaseEntity {

    @ApiModelProperty("设计方案id")
    private String designId;

    @ApiModelProperty("浏览人id")
    private String visitorId;

    @ApiModelProperty("推荐人id")
    private String referId;

    @ApiModelProperty("所在城市")
    private String locationCity;

    @ApiModelProperty("奖励")
    private BigDecimal rewardAmount;

    @ApiModelProperty("是否提现,0:否;1:是")
    private Integer cashStatus;

    @ApiModelProperty("提现id")
    private String cashId;

    @ApiModelProperty("浏览时间")
    private LocalDateTime viewTime;
}
