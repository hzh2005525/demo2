package com.sogal.wx.core.dao.domain.designer;

import com.sogal.wx.core.dao.domain.user.UserLoginToken;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QueryDesignerDetail {

    @ApiModelProperty("设计方案id")
    private String designerId;

    @ApiModelProperty(hidden = true)
    private UserLoginToken userLoginToken;


}
