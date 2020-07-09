package com.sogal.wx.core.dao.domain.special;

import com.sogal.wx.core.dao.domain.base.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author hzh
 * @date 2019-07-24
 * @description v1.6专题设计关联bean
 */

@Data
public class WechatSpecialDesign extends BaseEntity {

    @ApiModelProperty("专题Id")
    private String specialId;

    @ApiModelProperty("设计Id")
    private String designId;

}
