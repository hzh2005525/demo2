package com.sogal.wx.core.dao.domain.design;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChangeDesignHotLevel {

    @ApiModelProperty("设计方案id")
    private String id;

    @ApiModelProperty("火热度")
    private int hotLevel;

    private String updator;
}
