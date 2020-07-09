package com.sogal.wx.core.dao.mapper;

import com.sogal.wx.core.dao.domain.promotion.UserPromotionContract;

public interface UserPromotionContractMapper {

    int addUserPromotionContractBySelective(UserPromotionContract userPromotionContract);

    int updateUserPromotionContractCardByAesId(UserPromotionContract userPromotionContract);

}
