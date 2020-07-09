package com.sogal.wx.core.dao.mapper;

import com.sogal.common.domain.criteria.PageInfo;
import com.sogal.wx.core.dao.domain.message.MpMessageLog;
import com.sogal.wx.core.dao.domain.message.MpMessageLogDTO;
import com.sogal.wx.core.dao.domain.message.MpMessageLogQueryCondition;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MpMessageLogMapper {

    int addMpMessageLogBySelective(MpMessageLog mpMessageLog);

    List<MpMessageLogDTO> list(@Param("messageLogQueryCondition") MpMessageLogQueryCondition messageLogQueryCondition,
                               @Param("pageInfo") PageInfo pageInfo);

    int count(@Param("messageLogQueryCondition") MpMessageLogQueryCondition messageLogQueryCondition);

}
