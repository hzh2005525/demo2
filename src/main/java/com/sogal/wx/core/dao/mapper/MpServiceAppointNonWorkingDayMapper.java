package com.sogal.wx.core.dao.mapper;

import com.sogal.wx.core.dao.domain.kitchen.MpServiceAppointNonWorkingDay;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

@Mapper
public interface MpServiceAppointNonWorkingDayMapper {

    void serviceDateSetting(MpServiceAppointNonWorkingDay mpServiceAppointNonWorkingDay);

    List<String> findIdsByTypeAndDate(MpServiceAppointNonWorkingDay mpServiceAppointNonWorkingDay);

    void deleteNonWorkingDateByIds(@Param("ids") List<String> ids);

    List<String> findNoneWorkingDay(@Param("appointDate") Date date);
}
