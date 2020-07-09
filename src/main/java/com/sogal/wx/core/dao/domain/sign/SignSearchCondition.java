package com.sogal.wx.core.dao.domain.sign;

import com.sogal.wx.core.dao.domain.base.BaseCondition;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * Created by xiaoxuwang on 2019/3/6.
 */
@Data
public class SignSearchCondition extends BaseCondition{

    @ApiModelProperty("主键ID")
    private String id;
    @ApiModelProperty("标签分类")
    private String type;
    @ApiModelProperty("标签编码")
    private String code;

    @ApiModelProperty("标签分类多个")
    private List<String> types;


}
