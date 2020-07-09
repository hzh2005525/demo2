package com.sogal.wx.core.dao.mapper;

import com.sogal.common.domain.criteria.PageInfo;
import com.sogal.wx.core.dao.domain.share.QueryTemplateCondition;
import com.sogal.wx.core.dao.domain.share.ShareTemplate;
import com.sogal.wx.core.dao.domain.share.ShareTemplateDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface WechatShareTemplateMapper {
    void insertShareTemplate(ShareTemplateDTO shareTemplate);

    List<ShareTemplateDTO> findShareTemplatePagedByCondition(@Param("pageInfo")PageInfo pageInfo, @Param("queryCondition")  QueryTemplateCondition queryTemplateCondition);

    int countShareTemplatePagedByCondition(@Param("queryCondition") QueryTemplateCondition queryTemplateCondition);

    ShareTemplate findShareTemplateDetailById(@Param("id") String id);

    void updateShareTemplateById(ShareTemplate shareTemplate);

    void deleteShareTemplateById(@Param("id") String id);

    int countDesignNumQuoteTemplate(@Param("templateId") String templateId);

    int countByTemplateName(@Param("id") String id, @Param("templateNo") String templateNo);

    void updateShareTemplatePreviewImageById(@Param("path") String path, @Param("id") String id);

    String findShareTemplateIdByNo(@Param("templateNo") String templateNo);
}
