package com.sogal.wx.core.dao.domain.article;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.sogal.wx.core.dao.domain.base.BaseEntity;
import com.sogal.wx.core.dao.domain.base.WechatRealm;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CMSArticlePlainText extends BaseEntity {

    /**
     * 段落顺序
     */
    private int sorted;

    /**
     * 段落内容
     */
    private String content;

    /**
     * 文章归属实体类型
     */
    private WechatRealm realm;

    /**
     * 文章归属实体id
     */
    private String realmId;

    /**
     * 元素类型
     */
    private String elementType;

    /**
     * 全景图url
     */
    private String qjtUrl;

    /**
     * 是否有效
     */
    private Boolean valid;

    /**
     * 元素参数内容
     */
    private Map<String,Object> paramContent;

}
