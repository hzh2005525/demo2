package com.sogal.wx.core.dao.domain.share;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QueryTemplateCondition {

    @ApiModelProperty("模板类型")
    private String templateType;
    @ApiModelProperty("排序方式")
    private String orderMethod;
}
