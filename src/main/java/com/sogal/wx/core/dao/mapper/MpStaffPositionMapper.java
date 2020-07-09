package com.sogal.wx.core.dao.mapper;

import com.sogal.common.domain.criteria.PageInfo;
import com.sogal.wx.core.dao.domain.position.MpStaffPosition;
import com.sogal.wx.core.dao.domain.position.UserASDataPrivilege;
import com.sogal.wx.core.dao.domain.service.MpServiceProviderStaff;
import com.sogal.wx.core.dao.domain.service.MpServiceStaff;
import com.sogal.wx.core.dao.domain.service.QueryServiceStaffCondition;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.hibernate.validator.constraints.Length;

import java.util.List;

@Mapper
public interface MpStaffPositionMapper {

    void insertMpStaffPosition(MpStaffPosition mpStaffPosition);

    void updateStaffPosition(@Param("staffId") String staffId, @Param("positionId") String positionId);

    UserASDataPrivilege findUserDataPrivilegeById(@Param("staffId") String userId);

    MpStaffPosition findMpStaffPositionByStaffId(@Param("staffId") String staffId);

    void updateStaffPositionById(MpStaffPosition mpStaffPositionExisted);
}
