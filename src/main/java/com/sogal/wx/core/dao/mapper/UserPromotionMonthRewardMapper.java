package com.sogal.wx.core.dao.mapper;

import com.sogal.common.domain.criteria.PageInfo;
import com.sogal.wx.core.dao.domain.promotion.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserPromotionMonthRewardMapper {

    List<UserPromotionMonthRewardDTO> selectUserPromotionMonthReward(@Param("unionId") String unionId,
                                                                     @Param("currentYear") Integer currentYear,
                                                                     @Param("currentMonth") Integer currentMonth);

    int addUserPromotionMonthRewardBySelective(UserPromotionMonthReward userPromotionMonthReward);

    UserPromotionMonthRewardDTO selectUserPromotionMonthRewardByUnionIdAndCy(@Param("unionId") String unionId,
                                                                             @Param("currentYear") Integer currentYear,
                                                                             @Param("currentMonth") Integer currentMonth);

    List<UserPromotionMonthRewardDTO> selectUserPromotionMonthRewardInfoByUnionIdAndCy(@Param("currentYear") Integer currentYear,
                                                                                       @Param("currentMonth") Integer currentMonth,
                                                                                       @Param("unionIds") List<String> unionIds);

    UserPromotionMonthRewardDTO selectUserPromotionTotalRewardInfoByUnionId(@Param("unionId") String unionId);

    List<UserPromotionMonthRewardSocialDTO> selectUserPromotionMonthRewardListByUnionIdAndMonth(
            @Param("userPromotionRewardQueryCondition") UserPromotionRewardQueryCondition userPromotionRewardQueryCondition,
            @Param("pageInfo") PageInfo pageInfo);

    int selectUserPromotionMonthRewardListByUnionIdAndMonthCount(@Param("userPromotionRewardQueryCondition")
                                                                         UserPromotionRewardQueryCondition userPromotionRewardQueryCondition);

    List<UserPromotionMonthRewardDTO> selectUserPromotionMonthAccount(@Param("unionId") String unionId,
                                                                      @Param("currentYear") Integer currentYear,
                                                                      @Param("currentMonth") Integer currentMonth);

    UserPromotionMonthReward selectUserPromotionMonthRewardById(@Param("id") String id);

    List<PromotionApplyFeeRequestDTO> selectPromotionApplyFeeByYearAndMonth(@Param("year") Integer year,
                                                                            @Param("month") Integer month);

    List<PromotionApplyFeeRequestDTO> selectPromotionApplyFeeByMonthIds(@Param("monthIds") List<String> monthIds);

    int updateUserPromotionMonthRewardById(UserPromotionMonthReward userPromotionMonthReward);

    List<UserPromotionMonthRewardSocialDTO> getCashDetailByStatus(@Param("monthStatus") List<Integer> monthStatus,
                                                                  @Param("userPromotionSocialQueryCondition")
                                                                          UserPromotionSocialQueryCondition
                                                                          userPromotionSocialQueryCondition,
                                                                  @Param("pageInfo") PageInfo pageInfo);

    int getCashDetailByStatusCount(@Param("monthStatus") List<Integer> monthStatus,
                                   @Param("userPromotionSocialQueryCondition")
                                           UserPromotionSocialQueryCondition
                                           userPromotionSocialQueryCondition);

    List<UserPromotionMonthReward> selectUserPromotionMonthRewardStatusByIds(@Param("monthIds") List<String> monthIds);

    int updateUserPromotionMonthRewardBySettle(@Param("settleAccountTime") String settleAccountTime,
                                               @Param("currentYear") Integer currentYear,
                                               @Param("currentMonth") Integer currentMonth);

    int updateUserPromotionMonthRewardsByIds(@Param("fundsNo") String fundsNo,
                                             @Param("monthIds") List<String> monthIds);

    int updateUserPromotionMonthRewardsFundsStatusByFundsNo(@Param("fundsStatus") Integer fundsStatus,
                                                            @Param("fundsNo") String fundsNo);

}