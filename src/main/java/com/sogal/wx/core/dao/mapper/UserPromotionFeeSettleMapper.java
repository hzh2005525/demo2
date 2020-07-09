package com.sogal.wx.core.dao.mapper;

import com.sogal.common.domain.criteria.PageInfo;
import com.sogal.wx.core.dao.domain.promotion.UserPromotionBillQueryCondition;
import com.sogal.wx.core.dao.domain.promotion.UserPromotionFeeSettle;
import com.sogal.wx.core.dao.domain.promotion.UserPromotionFeeSettleDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserPromotionFeeSettleMapper {

    int addUserPromotionFeeSettleBySelective(UserPromotionFeeSettle userPromotionFeeSettle);

    int updateUserPromotionFeeSettleByTargetServiceNo(UserPromotionFeeSettle userPromotionFeeSettle);

    UserPromotionFeeSettle selectUserPromotionFeeSettleByTargetServiceNo(String targetServiceNo);

    int updateUserPromotionFeeSettleByDateAndPayStatus(@Param("billStatus") Integer billStatus,
                                                       @Param("billFailReason") String billFailReason,
                                                       @Param("currentYears") String currentYears);

    List<UserPromotionFeeSettleDTO> getBillDetailByStatus(@Param("billStatus") List<Integer> billStatus,
                                                          @Param("userPromotionBillQueryCondition")
                                                                  UserPromotionBillQueryCondition
                                                                  userPromotionBillQueryCondition,
                                                          @Param("pageInfo") PageInfo pageInfo);

    int getBillDetailByStatusCount(@Param("billStatus") List<Integer> billStatus,
                                   @Param("userPromotionBillQueryCondition")
                                           UserPromotionBillQueryCondition
                                           userPromotionBillQueryCondition);

}
