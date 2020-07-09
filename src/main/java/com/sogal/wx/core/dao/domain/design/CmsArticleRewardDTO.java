package com.sogal.wx.core.dao.domain.design;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class CmsArticleRewardDTO extends CmsArticleReward {

    @ApiModelProperty("地区")
    private List<String> areas;

}