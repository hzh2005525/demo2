package com.sogal.wx.core.dao.domain.sign;

import com.sogal.wx.core.dao.domain.base.BaseEntity;
import com.sogal.wx.core.dao.domain.base.WechatCategory;
import com.sogal.wx.core.dao.domain.image.WechatImage;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by xiaoxuwang on 2019/2/21.
 */
@Getter
@Setter
public class WechatSysSign extends BaseEntity{

    @ApiModelProperty("类别")
//    private SysSignType type;
    private String type;

    @ApiModelProperty(value = "是否系统默认", hidden = true)
    private boolean defaultSign;
    @ApiModelProperty(value = "是否拥有行为", hidden = true)
    private boolean behavior;
    @ApiModelProperty("编码")
    private String code;
    @ApiModelProperty("中文值")
    private String value;
    @ApiModelProperty(value = "是否有效", hidden = true)
    private boolean valid;
    @ApiModelProperty("详细描述")
    private String desc;
    @ApiModelProperty(hidden = true)
    private String creatorOrgId;
    @ApiModelProperty(hidden = true)
    private String creatorOrgName;
    @ApiModelProperty(hidden = true)
    private String creatorName;
    private String icon;
    private String cover;
    private String iconUrl;
    private String coverUrl;
    private WechatCategory category;

    @ApiModelProperty("排序字段")
    private int sorted;
    @ApiModelProperty("自定义图标")
    private String customIcon;
    private WechatImage iconImage;
    private WechatImage coverImage;






}
