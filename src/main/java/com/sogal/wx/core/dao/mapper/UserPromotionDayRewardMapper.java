package com.sogal.wx.core.dao.mapper;

import com.sogal.common.domain.criteria.PageInfo;
import com.sogal.wx.core.dao.domain.mine.MyRecordDTO;
import com.sogal.wx.core.dao.domain.promotion.UserPromotionDayReward;
import com.sogal.wx.core.dao.domain.promotion.UserPromotionDayRewardDTO;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

public interface UserPromotionDayRewardMapper {

    UserPromotionDayReward selectUserPromotionDayGroupReward(@Param("unionId") String unionId,
                                                             @Param("rewardType") Integer rewardType,
                                                             @Param("rewardTime") String rewardTime);

    int addUserPromotionDayRewardBySelective(UserPromotionDayReward userPromotionDayReward);

    int addUserPromotionMeasureDayRewardBatch(@Param("list") List<UserPromotionDayReward> list);

    BigDecimal selectDirectLowerPromotionGroupRewardByUnionIdAndCy(@Param("unionId") String unionId,
                                                                   @Param("rewardType") Integer rewardType,
                                                                   @Param("currentYear") Integer currentYear,
                                                                   @Param("currentMonth") Integer currentMonth);

    int deleteUserPromotionMeasureDayReward(@Param("unionId") String unionId,
                                            @Param("rewardType") Integer rewardType,
                                            @Param("currentYear") Integer currentYear,
                                            @Param("currentMonth") Integer currentMonth);

    BigDecimal calculateGoldPromotionLevelByUnionIds(@Param("rewardType") Integer rewardType,
                                                     @Param("unionIds") List<String> unionIds);

    List<UserPromotionDayReward> selectUserPromotionDayDeals(@Param("unionId") String unionId,
                                                             @Param("rewardType") Integer rewardType,
                                                             @Param("rewardTime") String rewardTime);

    int updateUserPromotionDayDealRewardBySelective(UserPromotionDayReward userPromotionDayReward);

    long selectUserPromotionMonthDealAmountCount(@Param("unionId") String unionId,
                                                 @Param("rewardType") Integer rewardType);

    List<UserPromotionDayRewardDTO> selectUserPromotionDayCommendedReward(@Param("unionId") String unionId,
                                                                          @Param("rewardTypes") List<Integer> rewardTypes,
                                                                          @Param("currentYear") Integer currentYear,
                                                                          @Param("currentMonth") Integer currentMonth);

    UserPromotionDayRewardDTO selectUserPromotionDayDealRewardDTOById(@Param("id") String id);

    long selectUserPromotionDayRewardAmountCountByRewardType(@Param("unionId") String unionId,
                                                             @Param("rewardType") Integer rewardType,
                                                             @Param("dto") MyRecordDTO dto);

    List<UserPromotionDayRewardDTO> selectUserPromotionDayRewardAmountyRewardType(@Param("unionId") String unionId,
                                                                                  @Param("rewardType") Integer rewardType,
                                                                                  @Param("dto") MyRecordDTO dto,
                                                                                  @Param("pageInfo") PageInfo pageInfo);

}
