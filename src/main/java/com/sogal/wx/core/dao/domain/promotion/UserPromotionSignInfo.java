package com.sogal.wx.core.dao.domain.promotion;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class UserPromotionSignInfo extends UserPromotionIdentifyCard {

    @ApiModelProperty("模板名称")
    private String templateName;

    @ApiModelProperty("合同状态,0:待审核;1:生效中;2:驳回;3:已到期;4:已失效;5:已终止")
    private Integer SignStatus;

    @ApiModelProperty("合同签署日期")
    private String contractSignDt;

    @ApiModelProperty("合同失效日期")
    private String contractInvalidDt;

    @ApiModelProperty("合同地址")
    private String contractUrl;

}
