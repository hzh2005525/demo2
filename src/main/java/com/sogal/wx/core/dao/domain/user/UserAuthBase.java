package com.sogal.wx.core.dao.domain.user;

import com.sogal.wx.core.dao.domain.base.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class UserAuthBase extends BaseEntity {

    @ApiModelProperty("用户unionId")
    private String unionId;

    @ApiModelProperty("经销商ID")
    private String repoId;

    @ApiModelProperty("推广大使类别")
    private String emissaryType;

    @ApiModelProperty("是否是推广大使")
    private Boolean isEmissary;

    @ApiModelProperty("推广大使签订协议")
    private String agreement;

}
