package com.sogal.wx.core.dao.mapper;

import com.sogal.wx.core.dao.domain.link.MpAccessLink;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MpAccessLinkMapper {

    List<MpAccessLink> selectMpAccessLinkListByAppId(@Param("appId") String appId);

    int addMpAccessLinkBySelective(MpAccessLink mpAccessLink);

    int updateMpAccessLinkById(MpAccessLink mpAccessLink);

    int deleteMpAccessLinkListById(@Param("id") String id);

}
