package com.sogal.wx.core.dao.domain.special;

import com.sogal.wx.core.dao.domain.base.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author hzh
 * @date 2019-07-23
 * @description v1.6专题管理实体bean
 */
@Data
public class WechatSpecialTopic extends BaseEntity {

    @ApiModelProperty("专题名称")
    private String name;

    @ApiModelProperty("专题图片URL")
    private String imageUrl;

    @ApiModelProperty("专题详情图片URL")
    private String detailUrl;

    @ApiModelProperty("专题类别")
    private String kind;

    @ApiModelProperty("设计数量")
    private Integer designCount;

    @ApiModelProperty("是否有效,0:无效；1:有效")
    private Integer valid;

    @ApiModelProperty("发布状态,0:未发布；1:已发布")
    private Integer publishStatus;

}
