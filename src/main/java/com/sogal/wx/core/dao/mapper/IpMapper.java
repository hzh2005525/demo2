package com.sogal.wx.core.dao.mapper;

import com.sogal.wx.core.dao.domain.ip.IpArea;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface IpMapper {

    List<IpArea> findIpDataNotInIpArea();

    void insertIpArea(IpArea ipArea);

    int findNumByIpAtIpArea(@Param("intIp") String intIp,
                            @Param("ip") String ip);
}
