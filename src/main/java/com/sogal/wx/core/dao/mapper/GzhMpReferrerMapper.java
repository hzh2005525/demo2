package com.sogal.wx.core.dao.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface GzhMpReferrerMapper {
    String findLastSharerUserIdAtGzhMpReferrerByUserId(@Param("userId") String userId,
                                                       @Param("gzhAppId") String gzhAppId);
}
