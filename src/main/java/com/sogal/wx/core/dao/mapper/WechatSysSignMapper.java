package com.sogal.wx.core.dao.mapper;

import com.sogal.wx.core.dao.domain.base.WechatCategory;
import com.sogal.wx.core.dao.domain.sign.SignSearchCondition;
import com.sogal.wx.core.dao.domain.sign.WechatSysSign;
import com.sogal.wx.core.dao.domain.sign.WechatSysSignResultAtC;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * Created by xiaoxuwang on 2019/2/25.
 */
@Mapper
public interface WechatSysSignMapper {

    int addSign(WechatSysSign wechatSysSign);

    List<WechatSysSign> findSignsByCondition(SignSearchCondition signSearchCondition);

    int deleteSysSign(@Param("id")String id);

    WechatSysSign findSysSignById(@Param("id")String id);

    List<String> findSysSignIdsBySignType(@Param("type")String type, @Param("category")WechatCategory category);

    int deleteSysSignsByIds(List<String> ids);

    int updateSysSign(WechatSysSign wechatSysSign);

    List<String> findSignIdsByCode(@Param("code") String code);

    void batchUpdateTypeOfSysSign(@Param("ids") List<String> sysSignIds,@Param("sysSign") WechatSysSign wechatSysSign);

    List<WechatSysSignResultAtC> findShowSignsByCondition(SignSearchCondition condition);

    void updateSysSignSortToMax(@Param("id") String id, @Param("updater") String updater);

    List<WechatSysSign> findSignsByCategory(@Param("category") WechatCategory category);

    void updateSysSignSort(@Param("id") String id, @Param("sorted") int sorted);

    List<String> findltTargetSortedSignIds(@Param("sorted") int sorted);

    void subSignsortedltTargetSorted(@Param("ids") List<String> ids);

    List<String> findmtTargetSortedSignIds(@Param("sorted") int sorted);

    void addSignsortedmtTargetSorted(@Param("ids") List<String> signIds);

    List<WechatSysSign> findTagsByIds(@Param("ids") List<String> tagIds);

    List<String> findSysSignIdsByType(@Param("type") String type);
}
