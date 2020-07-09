package com.sogal.wx.core.dao.mapper;

import com.sogal.wx.core.dao.domain.coupon.MyCoupon;
import com.sogal.wx.core.dao.domain.luckDraw.CmsLuckDraw;
import com.sogal.wx.core.dao.domain.luckDraw.CmsLuckDrawPrize;
import com.sogal.wx.core.dao.domain.luckDraw.CmsLuckDrawUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;


@Mapper
public interface CmsLuckDrawMapper {

    CmsLuckDraw getLuckDraw(@Param("id") String id);

    List<CmsLuckDrawPrize> getLuckDrawPrizes(@Param("parentid") String parentid);

    List<CmsLuckDraw> quertLuckDrawsPage(@Param("subject") String subject,
                                         @Param("startTime") String startTime,
                                         @Param("endTime") String endTime,
                                         @Param("page") int page,
                                         @Param("size") int size);

    int countLuckDraws(@Param("subject") String subject,
                       @Param("startTime") String startTime,
                       @Param("endTime") String endTime);

    void insertLuckDraw(CmsLuckDraw luckDraw);

    void insertLuckDrawPrizes(@Param("prizes") List<CmsLuckDrawPrize> prizes, @Param("parentId") String parentId);

    void deleteLuckDrawPrizeByParentId(@Param("parentId") String parentId);

    void deleteLuckDrawById(@Param("id") String id);

    void updateLuckDraw(CmsLuckDraw luckDraw);

    int checkingLuckDrawUser(@Param("userId") String userId, @Param("luckId") String luckId);

    CmsLuckDrawPrize getLuckDrawPrizeById(@Param("id") String id);


    int getTotalLuckDrawPrize(@Param("luckId") String luckId);

    void updateLuckDrawPrize(CmsLuckDrawPrize prize);

    CmsLuckDrawPrize getLuckDrawPrizeMax(@Param("parentId") String parentId);

    void insertCmsLuckDrawUser(CmsLuckDrawUser luckDrawUser);

    List<CmsLuckDrawUser> quertLuckDrawsUserPage(@Param("mobile") String mobile,
                                                 @Param("name") String name,
                                                 @Param("city") String city,
                                                 @Param("luckId") String luckId,
                                                 @Param("page") int page,
                                                 @Param("size") int size);

    List<CmsLuckDrawUser> exportLuckDrawsUsers(@Param("mobile") String mobile,
                                               @Param("name") String name,
                                               @Param("city") String city,
                                               @Param("luckId") String luckId);

    int countexportLuckDrawsUsers(@Param("mobile") String mobile,
                                  @Param("name") String name,
                                  @Param("city") String city,
                                  @Param("luckId") String luckId);

    int countLuckDrawUser(@Param("mobile") String mobile,
                          @Param("name") String name,
                          @Param("city") String city,
                          @Param("luckId") String luckId);


    int getUserNum(@Param("userId") String userId, @Param("luckId") String luckId);

    void updateLuckDrawUser(CmsLuckDrawUser luckDrawUser);

    List<MyCoupon> getMyLuckDrawPrize(@Param("userId") String userId);

    List<CmsLuckDrawUser> getLuckDrawUserByLuckId(@Param("luckId") String luckId);
}
