package com.sogal.wx.core.dao.mapper;

import com.sogal.wx.core.dao.domain.base.WechatCategory;
import com.sogal.wx.core.dao.domain.sign.SignSearchCondition;
import com.sogal.wx.core.dao.domain.sign.SysSignType;
import com.sogal.wx.core.dao.domain.sign.SysSignTypeResultAtC;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.hibernate.validator.constraints.Length;

import java.util.List;

/**
 * Created by xiaoxuwang on 2019/4/16.
 */
@Mapper
public interface WechatSysSignTypeMapper {

    int addSysSignType(SysSignType sysSignType);

    List<SysSignType> findSysSignTypeWithCategory();

    int updateSysSignType(SysSignType sysSignType);

    int deleteSysSignType(@Param("id") String id);

    SysSignType findSysSignTypeWithCategoryId(@Param("id") String id, @Param("category") WechatCategory category);

    int findSysSignTypeExisted(@Param("category") WechatCategory category, @Param("type")String type,
                               @Param("id") String id);

    void updateSysSignTypeShowValid(SysSignType sysSignType);

    List<SysSignTypeResultAtC> findShowSignTypesByCondition(SignSearchCondition condition);

    SysSignType findSysSignTypeById(@Param("id") String id);

    void updateSysSignTypeSortToMax(@Param("id")String id, @Param("updater") String updater);

    void updateSysSignTypeSort(@Param("id") String id, @Param("sort") int sort);

    List<String> findltTargetSortedSignTypeIds(@Param("sort") int sort);

    void subSignTypesortedltTargetSorted(@Param("ids") List<String> signIds);

    List<String> findmtTargetSortedSignTypeIds(@Param("sort")  int sort);

    void addSignTypesortedmtTargetSorted(@Param("ids") List<String> signIds);

    int querySysSignTypeExisted(@Param("type")String type,
                                @Param("id") String id);
}
