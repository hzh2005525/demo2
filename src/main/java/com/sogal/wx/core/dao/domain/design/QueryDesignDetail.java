package com.sogal.wx.core.dao.domain.design;

import com.sogal.wx.core.dao.domain.user.UserLoginToken;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QueryDesignDetail {

    @ApiModelProperty("设计方案id")
    private String designId;

    @ApiModelProperty("设计方案编号")
    private String designNo;

    @ApiModelProperty("文章唯一编号")
    private String uniqueNo;

    @ApiModelProperty(hidden = true)
    private UserLoginToken userLoginToken;

    @ApiModelProperty(hidden = true)
    private String visitBrowseId;

    @ApiModelProperty(hidden = true)
    private String shareRecordId;

    @ApiModelProperty(hidden = true)
    private String ip;

}
