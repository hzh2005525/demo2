package com.sogal.wx.core.dao.mapper;

import com.sogal.common.domain.criteria.PageInfo;
import com.sogal.wx.core.dao.domain.base.WechatCategory;
import com.sogal.wx.core.dao.domain.charts.UserChartsCondition;
import com.sogal.wx.core.dao.domain.charts.UserChartsDTO;
import com.sogal.wx.core.dao.domain.promotion.UserBasicInfo;
import com.sogal.wx.core.dao.domain.user.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.HashSet;
import java.util.List;
import java.util.Map;

@Mapper
public interface UserMpMapper {

    int updateMpUserInfoSelectiveById(WechatUser wechatUser);

    int updateUserMpEssentialInfo(UserEssentialInfo userEssentialInfo);

    WechatUser findUserMpById(@Param("userId") String userId);

    WechatSharerBasicInfo findUserBasicInfo(QueryUserNotLoginCondition queryUserNotLoginCondition);

    int updateUserPersonalEssentialInfo(UserEssentialInfo userEssentialInfo);

    UserInfoExtendDTO findUserByOpenId(@Param("openId") String openId, @Param("category") WechatCategory category);

    int syncUserUnionId(WechatUser wechatUser);

    int addNewUserMpBySelective(WechatUser wechatUser);

    List<WechatUserDTO> findUserMpsAtAdmin(@Param("queryUserCondition") QueryUserCondition queryUserCondition,
                                           @Param("pageInfo") PageInfo pageInfo);

    int countFindUserMpsAtAdmin(@Param("queryUserCondition") QueryUserCondition queryUserCondition);

    int updateRemarkById(@Param("remark") String remark, @Param("id") String id);

    List<UserChartsDTO> findUserChartsByVisitTotalOfVisitor(UserChartsCondition queryCondition);

    int countUserChartsByVisitTotalOfVisitor(UserChartsCondition queryCondition);

    List<UserChartsDTO> findUserChartsByVisitorTotal(UserChartsCondition queryCondition);

    int countUserChartsByVisitorTotal(UserChartsCondition queryCondition);

    List<UserChartsDTO> findUserChartsBySignUpTotal(UserChartsCondition queryCondition);

    int countUserChartsBySignUpTotal(UserChartsCondition queryCondition);

    List<UserFissonInfoDTO> findUserFissionInfoAtFirst(@Param("userId") String userId);

    List<UserFissonInfoDTO> findUserFissionInfo(@Param("userId") String userId);

    List<WechatUser> findUserMpsByUserId(@Param("sets") HashSet<String> sets);

    List<WechatUserRegisterDTO> selectWechatUserRegisterInfoByPageAtAdmin(@Param("queryUserCondition")
                                                                                  QueryUserCondition queryUserCondition,
                                                                          @Param("pageInfo") PageInfo pageInfo);

    int countWechatUserRegisterInfoTotalByPageAtAdmin(@Param("queryUserCondition") QueryUserCondition queryUserCondition);

    List<WechatUserRegisterDTO> selectWechatUserRegisterInfoByPageAtAdminLast(
            @Param("queryUserCondition") QueryUserCondition queryUserCondition, @Param("pageInfo") PageInfo pageInfo);

    int countWechatUserRegisterInfoTotalByPageAtAdminLast(
            @Param("queryUserCondition") QueryUserCondition queryUserCondition);

    List<WechatUserRegisterDTO> selectUserRegisterInfoAtAdminLastNoPage(
            @Param("queryUserCondition") QueryUserCondition queryUserCondition);

    List<WechatUserRegisterDTO> selectUserRegisterInfoAtAdminNoPage(
            @Param("queryUserCondition") QueryUserCondition queryUserCondition);

    List<WechatUserDTO> findUserMps(@Param("queryUserCondition") QueryUserCondition queryUserCondition);

    WechatUserDetailDTO findUserMpDetailInfo(@Param("userId") String userId);

    List<WechatUser> getUserMpByMobile(@Param("mobile") String mobile);

    WechatUser findUserMpByUserNo(@Param("userNo") String userNo, @Param("category") WechatCategory category);

    int countExportUserMps(@Param("queryUserCondition") QueryUserCondition queryUserCondition);

    List<Map<String, String>> getMpCategoryByUnionId(@Param("unionId") String unionId);


    UserBasicInfo findUserInfoByUserNo(@Param("userNo") String userNo);

    UserBasicInfo findUserInfoByUnionId(@Param("unionId") String unionId, @Param("category") WechatCategory category);

    UserBasicInfo findUserInfoByUserId(@Param("userId") String userId);

    int countFindMpUserRegister(@Param("userNo") String userNo);

    Integer findWatchGzhStatus(@Param("unionId") String unionId, @Param("appId") String appId);

    String findGzhNameById(@Param("id") String id);

    WechatUser findUserMpByUserId(@Param("userId") String userId);

    List<WechatUser> getDesignerUserMpByUnionId(@Param("unionId") String unionId);

    WechatUser findMpUserByUserNo(@Param("userNo") String userNo);

    WechatUser findUserMpByUnionIdAndCategory(@Param("unionId") String unionId,
                                              @Param("category") WechatCategory category);

    void updateMpUserLevel(WechatUser mpUser);


    WechatUser findUserMpByMobileAndCode(@Param("mobile") String mobile,
                                         @Param("vipCode") String code);


    List<WechatUser> findMpUserInfosByUserIds(@Param("ids") List<String> referUserIds);

    void updateMpUserBasicInfoAtLoginById(UserInfoExtendDTO userInfoExtendDTO);

    List<String> findUserNoListByUnionIdAndCategories(@Param("unionId") String unionId,
                                                      @Param("categories") List<WechatCategory> categories);

    WechatUser findGzhUserInfoByGzhIdAndDspStaffMobile(@Param("gzhId") String gzhId,
                                               @Param("mobile") String mobile);
}
