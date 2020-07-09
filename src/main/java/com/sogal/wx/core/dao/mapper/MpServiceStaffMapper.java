package com.sogal.wx.core.dao.mapper;

import com.sogal.common.domain.criteria.PageInfo;
import com.sogal.wx.core.dao.domain.service.MpServiceProviderStaff;
import com.sogal.wx.core.dao.domain.service.MpServiceStaff;
import com.sogal.wx.core.dao.domain.service.MpServiceStaffDTO;
import com.sogal.wx.core.dao.domain.service.QueryServiceStaffCondition;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.hibernate.validator.constraints.Length;

import java.util.List;

@Mapper
public interface MpServiceStaffMapper {
    void insertMpServiceStaff(MpServiceStaff mpServiceStaff);

    int findNumServiceStaffMobile(@Param("id") String id, @Param("mobile") String mobile);

    void updateServiceStaff(MpServiceStaff mpServiceStaff);

    List<MpServiceStaffDTO> findServiceStaffsByCondition(@Param("queryCondition") QueryServiceStaffCondition queryServiceStaffCondition,
                                                         @Param("pageInfo") PageInfo pageInfo);

    void updateMpServiceStaffStatus(@Param("id") String id,
                                       @Param("status") String status,
                                       @Param("updater") String updater);

    MpServiceStaff findMpServiceStaffDetail(@Param("id") String id);

    void bindingServiceStaff(MpServiceProviderStaff mpServiceProviderStaff);

    void deleteServiceStaffBinding(@Param("bindingId") String bindingId);

    int findNumServiceStaffsByCondition(@Param("queryCondition") QueryServiceStaffCondition queryServiceStaffCondition);

    void deleteServiceProviderStaffBinding(MpServiceProviderStaff mpServiceProviderStaff);

    MpServiceStaff findServiceStaffByMobile(@Param("mobile") String mobile);

    List<MpServiceProviderStaff> findProviderStaffByStaffId(@Param("serviceStaffId") String serviceStaffId);

    MpServiceStaffDTO findASStaffInfoByMobile(@Param("mobile") String mobile);
}
