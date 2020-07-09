package com.sogal.wx.core.dao.mapper;

import com.sogal.wx.core.dao.domain.base.WechatCategory;
import com.sogal.wx.core.dao.domain.mine.MineCustomer;
import com.sogal.wx.core.dao.domain.mine.MyLatestSharer;
import com.sogal.wx.core.dao.domain.mine.MyRecordDTO;
import com.sogal.wx.core.dao.domain.mine.MySharer;
import com.sogal.wx.core.dao.domain.user.UserFissonInfoDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.HashSet;
import java.util.List;

/**
 *  @Author : zhaojie
 *  @Description :
 *  @Date : 2019/7/5
 */
@Mapper
public interface MySharerMapper {


    void addMySharer(MySharer mySharer);

    MySharer findMySharerByUserId(@Param("userId") String userId, @Param("category") WechatCategory category);

    void updateLatestSharerId(MySharer mySharer);

    List<MyLatestSharer> findUserLatestSharers(@Param("userIds") HashSet<String> userIdset);

    List<MyLatestSharer> findUserNextNumByUserId(@Param("userIds") HashSet<String> userIdset);

    List<MyLatestSharer> findUserNextNumByUserIdAtFirst(@Param("userIds") HashSet<String> userIdset);

    List<MyLatestSharer> findUserFirstSharers(@Param("userIds") HashSet<String> userIdset);

    String findLastSharerId(@Param("userId") String userId);

    List<String> findMyUserIdsAsFirstReferrer(@Param("firstSharerId") String firstSharerId);

    int findMyVisitorTotalAsFirstReferrer(MyRecordDTO dto);

    List<MineCustomer> findMyVisitorsAsFirstReferrer(MyRecordDTO dto);

    List<String> findAllReferUserInfo(@Param("userId") String userId);

    UserFissonInfoDTO findFirstReferUserIdsByUserId(@Param("userId") String userId);
}
