package com.sogal.wx.core.dao.mapper;

import com.sogal.wx.core.dao.domain.expose.UserExposeRewardCash;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDateTime;
import java.util.List;

public interface UserExposeRewardCashMapper {

    int addUserExposeRewardCashBySelective(UserExposeRewardCash userExposeRewardCash);

    int updateUserExposeRewardCashBySelective(UserExposeRewardCash userExposeRewardCash);

    int findUserExposeRewardCashApplyCount(@Param("mchAppid") String mchAppid,
                                           @Param("openId") String openId,
                                           @Param("todayStart") LocalDateTime todayStart,
                                           @Param("todayEnd") LocalDateTime todayEnd);

    List<UserExposeRewardCash> selectUserExposeRewardCashByStatusAndErrCode(@Param("status") Integer status,
                                                                            @Param("errCode") String errCode);

}
