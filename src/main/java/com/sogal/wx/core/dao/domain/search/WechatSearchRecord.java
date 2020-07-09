package com.sogal.wx.core.dao.domain.search;

import com.sogal.wx.core.dao.domain.base.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author hzh
 * @date 2019-07-25
 * @description v1.6搜索关键词记录实体bean
 */
@Data
public class WechatSearchRecord extends BaseEntity {

    @ApiModelProperty("用户编号")
    private String userNo;

    @ApiModelProperty("搜索关键词")
    private String keyWord;

}
