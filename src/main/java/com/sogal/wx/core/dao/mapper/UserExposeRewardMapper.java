package com.sogal.wx.core.dao.mapper;

import com.sogal.common.domain.criteria.PageInfo;
import com.sogal.wx.core.dao.domain.expose.UserExposeReward;
import com.sogal.wx.core.dao.domain.expose.UserExposeRewardDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserExposeRewardMapper {

    int addUserExposeRewardBySelective(UserExposeReward userExposeReward);

    int updateUserExposeRewardBySelective(UserExposeReward userExposeReward);

    int findUserExposeRewardCountByDesignIdAndVisitorId(@Param("designId") String designId,
                                                        @Param("visitorId") String visitorId);

    List<UserExposeReward> findUserExposeRewardListByDesignIdAndReferId(@Param("designId") String designId,
                                                                        @Param("referId") String referId);

    List<UserExposeReward> findUserExposeRewardListByDesignIdAndVisitorIds(@Param("designId") String designId,
                                                                           @Param("visitorIds") List<String> visitorIds);

    List<UserExposeRewardDTO> selectUserExposeRewardList(@Param("pageInfo") PageInfo pageInfo);

    int selectUserExposeRewardListCount();

}
