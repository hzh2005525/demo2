package com.sogal.wx.core.dao.domain.message;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class MpMessageLogDTO extends MpMessageLog {

    @ApiModelProperty("用户Id")
    private String userId;

    @ApiModelProperty("用户微信昵称")
    private String nickName;

    @ApiModelProperty("用户微信头像")
    private String avatarUrl;

    @ApiModelProperty("小程序名称")
    private String mpName;

}
