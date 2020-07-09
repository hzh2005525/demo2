package com.sogal.wx.core.dao.mapper;

import com.sogal.common.domain.criteria.PageInfo;
import com.sogal.wx.core.dao.domain.promotion.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserAuthPromotionMapper {

    int addUserAuthPromotionBySelective(UserAuthPromotion userAuthPromotion);

    UserAuthPromotion selectUserAuthPromotionByUnionId(@Param("unionId") String unionId);

    List<UserAuthPromotionInfo> selectUserAuthPromotionList(@Param("userAuthPromotionQueryCondition") UserAuthPromotionQueryCondition userAuthPromotionQueryCondition,
                                                            @Param("pageInfo") PageInfo pageInfo);

    int selectUserAuthPromotionListCount(@Param("userAuthPromotionQueryCondition") UserAuthPromotionQueryCondition userAuthPromotionQueryCondition);

    int updateStatusById(UserAuthPromotion userAuthPromotion);

    List<UserAuthPromotionInfo> selectUserAuthPromotionGroupList(@Param("userNoList") List<String> userNoList);


    UserAuthPromotionInfoDTO findtUserAuthPromotionByUnionIdAndAuthStatus(@Param("unionId") String unionId,
                                                                          @Param("authStatus") Integer authStatus);

    UserAuthPromotion findUserAuthPromotionById(@Param("id") String id);

    List<UserAuthPromotionDTO> selectUserAuthPromotionDTOListByAuthStatus(@Param("authStatus") Integer authStatus);

    List<UserAuthPromotion> selectUserAuthPromotionListByUserNoAndAuthStatus(@Param("userNo") String userNo,
                                                                             @Param("authStatus") Integer authStatus);

    int updateLevelById(@Param("level") String level, @Param("id") String id);

    int updateAutoEvictById(@Param("autoEvict") int autoEvict,
                            @Param("evictReason") String evictReason,
                            @Param("id") String id);

    int selectUserAuthPromotionPassengersCount(@Param("unionId") String unionId);

    List<UserAuthPromotionInfo> selectCmsUserAuthPromotionGroupList(
            @Param("userAuthPromotionQueryCondition") UserAuthPromotionQueryCondition userAuthPromotionQueryCondition,
            @Param("pageInfo") PageInfo pageInfo);

    int selectCmsUserAuthPromotionGroupListCount(
            @Param("userAuthPromotionQueryCondition") UserAuthPromotionQueryCondition userAuthPromotionQueryCondition);

    int selectPositionUrlCount(@Param("unionId") String unionId, @Param("positionUrl") String positionUrl);

    UserAuthPromotionDTO selectUserAuthPromotionLevelAndAuthStatus(@Param("unionId") String unionId);

}
