package com.sogal.wx.core.dao.domain.expose;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ExposeRewardMessage {

    @ApiModelProperty("设计方案id")
    private String designId;

    @ApiModelProperty("浏览人id")
    private String visitorId;

    @ApiModelProperty("推荐人id")
    private String referId;

    @ApiModelProperty("与查看分享、扫码分享关联id")
    private String shareRecordId;

    @ApiModelProperty("浏览人ip")
    private String visitorIp;

    @ApiModelProperty("浏览时间")
    private String visitTime;

}
