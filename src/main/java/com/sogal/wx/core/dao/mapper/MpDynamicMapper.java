package com.sogal.wx.core.dao.mapper;

import com.sogal.wx.core.dao.domain.dynamic.MpDynamic;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MpDynamicMapper {
    void insertMpDynamic(MpDynamic mpDynamic);

    List<MpDynamic> findAsServiceDynamicsByRealmId(@Param("realmId") String realmId);
}
