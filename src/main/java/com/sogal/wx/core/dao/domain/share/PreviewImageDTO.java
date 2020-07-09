package com.sogal.wx.core.dao.domain.share;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class PreviewImageDTO {
    @ApiModelProperty("设计方案编号")
    private  String realmNo;
    @ApiModelProperty("测试用户编号")
    private  String userNo;
    @ApiModelProperty("昵称")
    private  String  nickName;
    @ApiModelProperty("头像路径")
    private  String  avatarUrl;
}
