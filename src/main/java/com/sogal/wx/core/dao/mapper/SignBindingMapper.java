package com.sogal.wx.core.dao.mapper;

import com.sogal.wx.core.dao.domain.sign.SignBindingEntity;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created by xiaoxuwang on 2019/4/17.
 */
public interface SignBindingMapper {

    @MapKey(value= "realmId")
    Map<String, SignBindingEntity> findSignBindingEntities(@Param("list") List<String> realmIds, @Param("title")String title);

}
