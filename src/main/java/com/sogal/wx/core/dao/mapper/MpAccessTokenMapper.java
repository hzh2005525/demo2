package com.sogal.wx.core.dao.mapper;

import com.sogal.wx.core.dao.domain.mp.MpAccessToken;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MpAccessTokenMapper {

    List<MpAccessToken> list();

    int deleteById(@Param("id") String id);

    int addMpAccessToken(MpAccessToken mpAccessToken);

    int updateMpAccessToken(MpAccessToken mpAccessToken);

    MpAccessToken selectByAppId(@Param("appId") String appId);

}
