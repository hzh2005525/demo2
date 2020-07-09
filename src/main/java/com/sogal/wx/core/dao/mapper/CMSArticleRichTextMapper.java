package com.sogal.wx.core.dao.mapper;

import com.sogal.wx.core.dao.domain.article.CMSArticlePlainText;
import com.sogal.wx.core.dao.domain.base.WechatRealm;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CMSArticleRichTextMapper {

    void markArticleRichTextInvalidByIds(@Param("ids") List<String> richTextIds);

    List<String> findRichTextByRealmIdAndRealm(@Param("realmIds") List<String> ids, @Param("realm") WechatRealm realm);
}
