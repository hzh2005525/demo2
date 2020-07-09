package com.sogal.wx.core.dao.domain.base;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by xiaoxuwang on 2019/3/4.
 */
@Getter
@Setter
public abstract class BaseCondition {

    private Integer pageStart;
    private Integer pageSize;
    @ApiModelProperty(value = "数据库字段，A, B, C, ...", hidden = true)
    private String columns;
    @ApiModelProperty(hidden = true)
    private String needPage;

}
