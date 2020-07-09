package com.sogal.wx.core.dao.domain.message;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class MpMessageLogQueryCondition {

    @ApiModelProperty(value = "开始日期")
    private String startDate;

    @ApiModelProperty(value = "结束日期")
    private String endDate;

    @ApiModelProperty(value = "昵称")
    private String nickName;

}
