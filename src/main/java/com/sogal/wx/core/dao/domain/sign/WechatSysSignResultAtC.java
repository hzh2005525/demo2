package com.sogal.wx.core.dao.domain.sign;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 *  @Author : zhaojie
 *  @Description : 返回给c端的展示项
 *  @Date : 2019/8/14
 */
@Getter
@Setter
public class WechatSysSignResultAtC{

    @ApiModelProperty("标签id")
    private String id;

    @ApiModelProperty("类别")
    private String type;

    @ApiModelProperty("编码")
    private String code;

    @ApiModelProperty("标签中文值")
    private String value;

    @ApiModelProperty("标签图标url")
    private String iconUrl;

}
