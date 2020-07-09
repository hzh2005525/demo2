package com.sogal.wx.core.dao.domain.article;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by xiaoxuwang on 2019/2/20.
 */
@Getter
@Setter
public class WechatArticleDTO extends WechatArticle {

    private byte[] contentBytes;

}
