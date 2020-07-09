package com.sogal.wx.core.dao.mapper;


import com.sogal.wx.core.dao.domain.coupon.MpCoupon;
import com.sogal.wx.core.dao.domain.coupon.MpCouponHouse;
import com.sogal.wx.core.dao.domain.coupon.MpUserCoupon;
import com.sogal.wx.core.dao.domain.coupon.UserCoupon;
import com.sogal.wx.core.dao.domain.kitchen.UserKitchenNurseInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserCouponMapper {

    void addUserCoupon(UserCoupon userCoupon);

    int findCountUserCouponByCouponId(@Param("couponId") String couponId);

    List<UserKitchenNurseInfo> findUserKitchenNurseAddr(@Param("userId") String userId,
                                                        @Param("mobile") String mobile);

    void insertMpCoupon(MpCoupon mpCoupon);

    void insertMpCouponHouse(MpCouponHouse mpCouponHouse);

    List<String> findMpCouponIdsAllowedToReceiveByMobile(@Param("mobile") String mobile);

    void batchInsertMpUserCoupon(List<MpUserCoupon> mpUserCoupons);

    MpCoupon findMpCouponById(@Param("id") String couponId);

    List<MpCoupon> findMpCouponByCustId(@Param("custId") String custId);

    List<MpCoupon> findCouponByMobile(@Param("mobile") String mobile);

    int findNumServiceCouponReceivedOfCurrentMobile(@Param("mobile") String mobile);

    List<MpUserCoupon> findMpUserCouponInfoPermissibleReceiving();

    int makeMpCouponUsed(@Param("id") String couponId,
                         @Param("modeUsed") String modeUsed);

    int makeMpCouponUsable(String couponId);

    List<UserKitchenNurseInfo> findMSCouponAvailableInfoAtAdminByMobile(@Param("mobile") String mobile);

    int findMSCouponNumOfSchmidtOrderByMobile(@Param("mobile") String mobile);

    List<UserKitchenNurseInfo> findMSCouponUsedInfodByMobile(@Param("mobile") String mobile);

    int findMSCouponNumOfExpire();

    void updateServiceCouponExpired();

    int findCountUserCouponByUserIdAndSourceType(@Param("userId") String userId, @Param("sourceType") String sourceType);

    int findCountUserCouponByQrId(@Param("qrId") String qrId);

}
