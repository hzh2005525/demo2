package com.sogal.wx.core.dao.mapper;

import com.sogal.wx.core.dao.domain.article.CMSArticlePlainText;
import com.sogal.wx.core.dao.domain.base.WechatRealm;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CMSArticlePlainTextMapper {
    List<String> findParagraphsDeletingByArticleIdAndParagraphs(@Param("articleId") String articleId,
                                                                @Param("paragraphs") List<CMSArticlePlainText> paragraphs);

    void deleteParagraphsNotUsedByIds(@Param("ids") List<String> paragraphIds);

    void updateCMSArticlePlainTextById(CMSArticlePlainText cmsArticlePlainText);

    void batchInsertIgnoreCMSArticlePlainText(List<CMSArticlePlainText> paragraphs);
    List<CMSArticlePlainText> selectCMSArticlePlainTextByRealmIdAtAdmin(@Param("realmId") String realmId);
    List<CMSArticlePlainText> selectCMSArticlePlainTextByRealmIdAtC(@Param("realmId") String realmId);

    List<String> findPlainTextIdsByRealmAndRealmId(@Param("realm") WechatRealm realm,
                                                   @Param("realmIds") List<String> ids);

    void markArticlePlainTextInvalidByIds(@Param("ids") List<String> plainTextIds);

    void markArticlePlainTextInvalidByRealmId(@Param("realmId") String id);

    void markArticlePlainTextValidByRealmId(@Param("realmIds")List<String> ids);
}
