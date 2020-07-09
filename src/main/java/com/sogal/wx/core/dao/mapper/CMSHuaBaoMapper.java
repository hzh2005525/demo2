package com.sogal.wx.core.dao.mapper;

import com.sogal.common.domain.criteria.PageInfo;
import com.sogal.wx.core.dao.domain.huabao.CMSHuaBao;
import com.sogal.wx.core.dao.domain.share.QueryTemplateCondition;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CMSHuaBaoMapper {

    void insertCMSHuaBao(CMSHuaBao cmsHuaBao);

    CMSHuaBao findCMSHuaBaoById(String hbId);

    void updateCMSHuaBaoPreviewImageById(@Param("path") String path, @Param("id") String id);

    List<CMSHuaBao> findCMSHuaBaoPagedByCondition(@Param("pageInfo") PageInfo pageInfo,
                                                  @Param("queryCondition") QueryTemplateCondition queryTemplateCondition);

    int countCMSHuaBaoPagedByCondition(@Param("queryCondition") QueryTemplateCondition queryTemplateCondition);

    CMSHuaBao findCMSHuaBaoDetailById(@Param("id") String id);

    void updateCMSHuaBao(CMSHuaBao cmsHuaBao);

    void deleteCMSHuaBaoById(@Param("id") String id);

    void updateCMSHuaBaoStatus(CMSHuaBao cmsHuaBao);

    void updateCmsHuaBaoSortToMax(@Param("id") String id,
                                  @Param("updater") String updater);

    List<String> findMTTargetSortedCmsHuaBaoIds(@Param("sorted") int sorted);

    void addCmsHuaBaoSortedMTTargetSorted(@Param("ids") List<String> hbIds);

    void updateCmsHuaBaoSorted(@Param("id") String sourceId, @Param("sorted") int sorted);

    List<String> findLTTargetSortedCmsHuaBaoIds(@Param("sorted") int sorted);

    void subCmsHuaBaoSortedLTTargetSorted(@Param("ids") List<String> hbIds);

    List<CMSHuaBao> getPictorialListByCondition(@Param("queryCondition") QueryTemplateCondition queryTemplateCondition);

}
