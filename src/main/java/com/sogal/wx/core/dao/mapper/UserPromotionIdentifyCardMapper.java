package com.sogal.wx.core.dao.mapper;

import com.sogal.wx.core.dao.domain.promotion.UserPromotionIdentifyCard;
import com.sogal.wx.core.dao.domain.promotion.UserPromotionSignInfo;
import org.apache.ibatis.annotations.Param;

public interface UserPromotionIdentifyCardMapper {

    UserPromotionIdentifyCard selectUserPromotionIdentifyCardById(@Param("id") String id);

    UserPromotionIdentifyCard selectUserPromotionIdentifyCardByIdentityCode(@Param("identityCode") String identityCode);

    int addUserPromotionIdentifyCardBySelective(UserPromotionIdentifyCard userPromotionIdentifyCard);

    int updateUserPromotionIdentifyCardById(UserPromotionIdentifyCard userPromotionIdentifyCard);

    int updateUserPromotionIdentifyCardByIdentityCode(UserPromotionIdentifyCard userPromotionIdentifyCard);

    UserPromotionSignInfo selectUserPromotionSignInfoByUnionId(@Param("unionId") String unionId);

}
