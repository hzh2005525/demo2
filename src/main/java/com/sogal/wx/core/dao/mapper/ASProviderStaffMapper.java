package com.sogal.wx.core.dao.mapper;

import com.sogal.wx.core.dao.domain.service.MpServiceProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ASProviderStaffMapper {


    int findNumByStaffId(@Param("staffId") String staffId);
}
