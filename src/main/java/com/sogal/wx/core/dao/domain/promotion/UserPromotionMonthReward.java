package com.sogal.wx.core.dao.domain.promotion;

import com.sogal.wx.core.dao.domain.base.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class UserPromotionMonthReward extends BaseEntity {

    @ApiModelProperty("创薪unionId")
    private String unionId;

    @ApiModelProperty("0:未结算;1:已结算;2:已提现;3:提现失败;4:提现成功")
    private Integer status;

    @ApiModelProperty("成交额")
    private BigDecimal dealAmount;

    @ApiModelProperty("成交奖励")
    private BigDecimal dealReward;

    @ApiModelProperty("测量奖励")
    private BigDecimal measureReward;

    @ApiModelProperty("团队奖励")
    private BigDecimal groupReward;

    @ApiModelProperty("税前提现")
    private BigDecimal faceCash;

    @ApiModelProperty("扣税额")
    private BigDecimal taxAmount;

    @ApiModelProperty("实际提现")
    private BigDecimal realCash;

    @ApiModelProperty("带单数")
    private Integer orderNum;

    @ApiModelProperty("年")
    private Integer currentYear;

    @ApiModelProperty("月")
    private Integer currentMonth;

    @ApiModelProperty("结算时间")
    private String settleAccountTime;

    @ApiModelProperty("客户业务编号")
    private String targetServiceNo;

    @ApiModelProperty("请款状态,0:未请款;1:请款中;2:请款失败;3:请款成功")
    private Integer fundsStatus;

    @ApiModelProperty("请款流水号")
    private String fundsNo;

}
