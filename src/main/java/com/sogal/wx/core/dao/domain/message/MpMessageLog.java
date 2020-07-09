package com.sogal.wx.core.dao.domain.message;

import com.sogal.wx.core.dao.domain.base.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class MpMessageLog extends BaseEntity {

    @ApiModelProperty("openId")
    private String openId;

    @ApiModelProperty("appId")
    private String appId;

    @ApiModelProperty("模板Id")
    private String templateId;

    @ApiModelProperty("发送方")
    private String sendPerson;

    @ApiModelProperty("关键字1")
    private String keywordOne;

    @ApiModelProperty("关键字2")
    private String keywordTwo;

    @ApiModelProperty("关键字3")
    private String keywordThree;

    @ApiModelProperty("关键字4")
    private String keywordFour;

    @ApiModelProperty("消息内容")
    private String content;

}
