package com.sogal.wx.core.dao.mapper;

import com.sogal.common.domain.criteria.PageInfo;
import com.sogal.common.domain.dealer.EmployeeDTO;
import com.sogal.common.domain.user.UserDTO;
import com.sogal.wx.core.dao.domain.article.WechatArticle;
import com.sogal.wx.core.dao.domain.design.*;
import com.sogal.wx.core.dao.domain.mine.MineCollect;
import com.sogal.wx.core.dao.domain.mine.MyCollectDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface WechatDesignMapper extends SignBindingMapper {

    void insertWechatDesign(WechatDesign wechatDesign);

    void updateWechatDesign(@Param("wechatDesign") WechatDesign wechatDesign);

    WechatDesign findEntityByNo(@Param("designNo") String designNo);

    void insertWechatArticle(@Param("wechatArticle") WechatArticle wechatArticle, @Param("articleContentBytes") byte[] articleContentBytes);

    WechatArticle selectWechatArticleById(@Param("id") String id);

    List<WechatArticle> selectWechatArticlesByRealmId(@Param("realmId") String realmId);

    void updateWechatArticle(WechatArticle wechatArticle);

    void markDesignInvalidById(@Param("id") String id);

    void markArticleInvalidByDesignId(@Param("realmId") String realmId);

    void markDesignAndArticleInvalidByIds(@Param("ids") List<String> ids, @Param("employee") EmployeeDTO employee);

    WechatDesignDetailDTO findDesignDetailByIdAtAdmin(@Param("id") String id);

    List<WechatDesignDTO> findDesignsPagedByQueryCondition(@Param("queryCondition") DesignQueryCondition designQueryCondition, @Param("pageInfo") PageInfo pageInfo);

    int countDesignsPagedByQueryCondition(@Param("queryCondition") DesignQueryCondition designQueryCondition);

    void updateDesignHotLevel(@Param("changeDesignHotLevel") ChangeDesignHotLevel changeDesignHotLevel);

    WechatDesignDetailDTO findDesignDetailByIdAtC(String designId);

    List<WechatDesignScore> findHotLevelForRecommend();

    int synchronousHotLevel();

    void markDesignAndArticleValidByIds(@Param("ids") List<String> ids, @Param("employee") EmployeeDTO employee);

    void updateDesignsIndexNum(@Param("changeDesignIndexNum") ChangeDesignIndexNum changeDesignIndexNum);

    List<WechatDesign> findDesignsForBanner(DesignForBanner designForBanner);

    List<WechatDesignDTO> findDesignsPagedByQueryConditionAtC(@Param("queryCondition") DesignQueryCondition designQueryCondition, @Param("pageInfo") PageInfo pageInfo);

    int countDesignsPagedByQueryConditionAtC(@Param("queryCondition") DesignQueryCondition designQueryCondition);

    List<WechatDesign> findRecommendDesignBySysSigns(@Param("designId") String designId,
                                                     @Param("pageStart") int pageStart,
                                                     @Param("pageSize") int pageSize,
                                                     @Param("designs") List<WechatDesign> designs,
                                                     @Param("dto") WechatDesignDetailDTO dto);

    void publishDesigns(@Param("ids") List<String> ids, @Param("wechatDesign") WechatDesign wechatDesign);

    void cancelPublish(@Param("ids") List<String> ids, @Param("wechatDesign") WechatDesign wechatDesign);

    void replaceWechatDesignCoverId(@Param("id") String designId, @Param("cover") String coverId);

    void replaceWechatDesignPosterId(@Param("id") String designId, @Param("poster") String posterId);

    WechatDesign findDesignBasicInfoById(@Param("id") String id);

    List<MineCollect> findMyCollect(MyCollectDTO myCollectDTO);

    int findMyCollectTotal(MyCollectDTO myCollectDTO);

    WechatDesignBasicInfo findDesignBasicInfo(QueryDesignNotLoginCondition queryDesignCondition);

    List<WechatDesignDTO> findDesignsByTemplateId(@Param("templateId") String templateId);

    void batchInsertDesignIndexNum(List<DesignIndexNum> designIndexNums);

    List<WechatDesign> findAllDesign();

    WechatDesign findLatestDesign();

    List<WechatDesign> findDesignByDesignerId(@Param("designerId") String designerId);

    List<WechatDesign> findDesignsOfDesignerPaged(@Param("queryCondition") DesignQueryCondition designQueryCondition, @Param("pageInfo") PageInfo pageInfo);

    int countDesignsOfDesignerPagedByQueryCondition(@Param("queryCondition") DesignQueryCondition designQueryCondition);

    void batchInsertDesignSpecialIndexNum(List<DesignIndexNum> designIndexNums);

    int countByUniqueNoId(@Param("uniqueNo") String uniqueNo, @Param("id") String id);

    WechatDesign findEntityByUniqueNo(@Param("uniqueNo") String uniqueNo);

    void markArticleInvalidByIds(@Param("ids") List<String> ids, @Param("user") UserDTO user);

    void markDesignValidByIds(@Param("ids") List<String> ids, @Param("employee") EmployeeDTO employee);

    void markArticleValidByDesignIds(@Param("ids") List<String> ids);

    WechatDesign findArticleNoPoster();
}
