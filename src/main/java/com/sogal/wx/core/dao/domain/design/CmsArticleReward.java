package com.sogal.wx.core.dao.domain.design;

import com.sogal.wx.core.dao.domain.base.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class CmsArticleReward extends BaseEntity {

    @ApiModelProperty("奖励类型,1:随机奖励;2:固定奖励")
    private Integer rewardType;

    @ApiModelProperty("随机最小奖励")
    private BigDecimal randomMinReward = BigDecimal.ZERO;

    @ApiModelProperty("随机最大奖励")
    private BigDecimal randomMaxReward = BigDecimal.ZERO;

    @ApiModelProperty("固定奖励")
    private BigDecimal fixReward = BigDecimal.ZERO;

    @ApiModelProperty("地区")
    private String area;

    @ApiModelProperty(value = "开始时间")
    private Date beginTime;

    @ApiModelProperty(value = "结束时间")
    private Date endTime;

}
