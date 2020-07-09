package com.sogal.wx.core.dao.domain.design;

import com.sogal.wx.core.dao.domain.base.BaseCondition;
import com.sogal.wx.core.dao.domain.base.WechatCategory;
import com.sogal.wx.core.dao.domain.user.UserLoginToken;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class DesignQueryCondition extends BaseCondition {

    private String userNo;

    private String designNo;

    private String designTitle;

    private String houseType;

    private DesignShowLevel showLevel;

    private WechatCategory category;

    private String kind;

    private String topicId;

    @ApiModelProperty("最高价格")
    private String hprice;
    @ApiModelProperty("最低价格")
    private String lprice;
    @ApiModelProperty("最小面积")
    private String minArea;
    @ApiModelProperty("最大面积")
    private String maxArea;

    private Boolean valid;

    private int page;

    private int size;

    @ApiModelProperty(hidden = true)
    private UserLoginToken userLoginToken;

    //include
    private List<String> signIds;

    private List<String> signIdsOr;

    private List<String> signIdsExcluding;

    @ApiModelProperty(hidden = true)
    private String noSign;

    private OrderMethod orderMethod = OrderMethod.GENERAL;

    private String code;

    private String designerId;

    //搜索关键字
    private String keywords;

}
