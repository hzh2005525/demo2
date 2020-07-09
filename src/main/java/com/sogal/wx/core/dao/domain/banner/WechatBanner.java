package com.sogal.wx.core.dao.domain.banner;

import com.sogal.wx.core.dao.domain.base.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by xiaoxuwang on 2019/2/20.
 */
@Getter
@Setter
public class WechatBanner extends BaseEntity {

    @ApiModelProperty("banner位置")
    private String group;
    @ApiModelProperty("图片id")
    private String imageId;
    @ApiModelProperty("点击事件")
    private String onclickUrl;
    @ApiModelProperty("banner描述")
    private String description;
    @ApiModelProperty("同一栏目下显示排序")
    private Integer sorted = 1;
    @ApiModelProperty("是否有效")
    private boolean valid;
    @ApiModelProperty("点击携带参数json字符串")
    private String onclickParams;
    @ApiModelProperty(hidden = true)
    private String creatorOrgId;
    @ApiModelProperty(hidden = true)
    private String creatorOrgName;
    @ApiModelProperty(hidden = true)
    private String creatorName;

    /**
     * 行政区域
     */
    private String administrativeRegions;

    /**
     * 目标小程序唯一标识
     */
    private String targetApp;

}
