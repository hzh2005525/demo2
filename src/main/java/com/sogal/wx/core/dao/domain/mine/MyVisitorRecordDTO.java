package com.sogal.wx.core.dao.domain.mine;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class MyVisitorRecordDTO extends MyVisitorRecord {

    @ApiModelProperty(value = "分享人昵称")
    private String nickName;
    @ApiModelProperty("用户微信头像")
    private String avatarUrl;
    @ApiModelProperty(value = "设计方案标题")
    private String title;

    @ApiModelProperty(value = "停留时间")
    private long retentionTime;

    public MyVisitorRecordDTO(){

    }

}
