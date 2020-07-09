package com.sogal.wx.core.dao.domain.banner;

import com.sogal.wx.core.dao.domain.base.BaseCondition;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by xiaoxuwang on 2019/3/4.
 */
@Getter
@Setter
public class BannerSearchCondition extends BaseCondition{

    @ApiModelProperty("banner描述")
    private String description;
    @ApiModelProperty("banner分组")
    private String group;
    @ApiModelProperty("定位城市")
    private String city;

}
