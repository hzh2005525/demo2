package com.sogal.wx.core.dao.domain.link;

import com.sogal.wx.core.dao.domain.base.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class MpAccessLink extends BaseEntity {

    @ApiModelProperty("appId")
    private String appId;

    @ApiModelProperty("链接名称")
    private String linkName;

    @ApiModelProperty("链接地址")
    private String linkPath;

}
