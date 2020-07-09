package com.sogal.wx.core.dao.mapper;

import com.sogal.wx.core.dao.domain.design.CmsArticleReward;
import com.sogal.wx.core.dao.domain.promotion.UserPromotionMonthReward;
import org.apache.ibatis.annotations.Param;

public interface CmsArticleRewardMapper {

    int deleteCmsArticleRewardById(@Param("id") String id);

    int addCmsArticleRewardBySelective(CmsArticleReward cmsArticleReward);

    int addOrUpdateCmsArticleRewardBySelective(CmsArticleReward cmsArticleReward);

    int updateCmsArticleRewardBySelective(CmsArticleReward cmsArticleReward);

    CmsArticleReward selectCmsArticleRewardById(@Param("id") String id);

}
