package com.sogal.wx.core.dao.domain.article;

import com.sogal.wx.core.dao.domain.base.BaseEntity;
import com.sogal.wx.core.dao.domain.base.WechatRealm;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by xiaoxuwang on 2019/2/20.
 */
@Getter
@Setter
public class WechatArticle extends BaseEntity {

    @ApiModelProperty(value = "文章标题")
    private String title;
    @ApiModelProperty(value = "文章中图片数")
    private int imageNum;
    @ApiModelProperty(value = "文章内容")
    private String content;
    @ApiModelProperty(value = "文章内容大纲")
    private String contentSyllabus;
    @ApiModelProperty(value = "文章归属实体")
    private WechatRealm realm;
    @ApiModelProperty(value = "文章归属实体id")
    private String realmId;
    @ApiModelProperty(value = "是否有效")
    private boolean valid;

}
