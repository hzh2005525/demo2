package com.sogal.wx.core.dao.mapper;

import com.sogal.wx.core.dao.domain.promotion.UserAuthPromotionRemark;
import org.apache.ibatis.annotations.Param;

public interface UserAuthPromotionRemarkMapper {

    int addUserAuthPromotionRemarkBySelective(UserAuthPromotionRemark userAuthPromotionRemark);

    UserAuthPromotionRemark selectByPromotionId(@Param("promotionId") String promotionId);

}
