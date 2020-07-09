package com.sogal.wx.core.dao.mapper;

import com.sogal.wx.core.dao.domain.service.MpServiceProvider;
import com.sogal.wx.core.dao.domain.service.MpServiceProviderDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.hibernate.validator.constraints.Length;

import java.util.List;

@Mapper
public interface MpServiceProviderMapper {
    void insertMpServiceProvider(MpServiceProvider mpServiceProvider);

    int findNumServiceProviderName(@Param("id") String id, @Param("name") String name);

    void updateServiceProvider(MpServiceProvider mpServiceProvider);

    List<MpServiceProvider> findServiceProviders();

    void updateMpServiceProviderStatus(@Param("id") String id,
                                       @Param("status") Boolean status,
                                       @Param("updater") String updater);

    MpServiceProviderDTO findMpServiceProviderDetail(@Param("id") String id);

    void updateASProviderLeader(MpServiceProvider mpServiceProvider);

    MpServiceProvider findASProviderById(@Param("id") String id);

}
