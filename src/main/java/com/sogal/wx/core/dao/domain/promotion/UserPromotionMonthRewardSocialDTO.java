package com.sogal.wx.core.dao.domain.promotion;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Map;

@Data
public class UserPromotionMonthRewardSocialDTO extends UserPromotionMonthRewardDTO {

    @ApiModelProperty("身份证")
    private String identityCode;

    @ApiModelProperty("人员结算编号")
    private String bourEmpNo;

    @ApiModelProperty("提现时间")
    private LocalDateTime cashTime;

    @ApiModelProperty("交易时间")
    private String payTime;

    @ApiModelProperty("交易信息")
    private String remark;

    @ApiModelProperty("实名认证状态,0:认证中;1:认证失败;2:认证成功;3:已到期")
    private Integer cardStatus;

    @ApiModelProperty("是否绑定银行卡,0:未绑卡;1:已绑卡")
    private Integer bankStatus;

}
