package com.sogal.wx.core.dao.mapper;

import com.sogal.common.domain.criteria.PageInfo;
import com.sogal.wx.core.dao.domain.kitchen.*;
import com.sogal.wx.core.dao.domain.position.UserASDataPrivilege;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

@Mapper
public interface MpServiceAppointMapper {

    int insertMpServiceAppoint(MpServiceAppoint mpServiceAppoint);

    List<MpServiceAppoint> findMpServiceAppointPaged(@Param("queryCondition") QueryServiceAppointCondition queryServiceAppointCondition,
                                                     @Param("userASDataPrivilege") UserASDataPrivilege userASDataPrivilege, @Param("pageInfo") PageInfo pageInfo);

    int countTotalMpServiceAppointPaged(@Param("queryCondition") QueryServiceAppointCondition queryServiceAppointCondition,
                                        @Param("userASDataPrivilege") UserASDataPrivilege userASDataPrivilege);

    void updateServiceProviderById(MpServiceAppoint mpServiceAppoint);

    MpServiceAppoint findMpServiceAppointById(@Param("id") String id);

    void updateServiceStaffInfoById(MpServiceAppoint mpServiceAppoint);

    void cancelServiceAppointById(@Param("id") String id, @Param("cancelReason") String cancelReason);

    List<ServiceNumOfDayAssigned> findServiceNumOfMonthAssigned(@Param("appointDate") Date date);

    void finishMpService(MpServiceAppoint mpServiceAppoint);

    void evaluateMpService(MpServiceAppoint mpServiceAppoint);

    List<MpServiceAppoint> findMpServiceByUserIdAtC(@Param("userId") String userId);

    ServiceAppointDetailDTOAtC findMpServiceDetailById(String id);

    void updatePlanServiceTimeById(MpServiceAppoint mpServiceAppoint);

    List<MpServicenNumByStage> findMpServicenNumByStage(@Param("queryCondition") QueryServiceAppointCondition queryServiceAppointCondition,
                                                        @Param("userASDataPrivilege") UserASDataPrivilege userASDataPrivilege);

    List<String> findMpServiceIdsRequiretoEvaluate();

    void autoEvaluateMpServiceFinished(@Param("ids") List<String> ids,
                                        @Param("evaluateContent") String evaluateContent);

    List<MpServiceAppoint> findMpServiceAppointPagedAtAdmin(@Param("queryCondition") QueryServiceAppointCondition queryServiceAppointCondition,
                                                             @Param("pageInfo") PageInfo pageInfo);

    int countTotalMpServiceAppointPagedAtAdmin(@Param("queryCondition") QueryServiceAppointCondition queryServiceAppointCondition);

    MpServiceAppoint findMpServiceDetailByIdAtH5(@Param("id") String id);
}
