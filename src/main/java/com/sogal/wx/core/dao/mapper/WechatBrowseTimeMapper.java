package com.sogal.wx.core.dao.mapper;

import com.sogal.wx.core.dao.domain.footmark.WechatBrowseTime;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by xiaoxuwang on 2019/3/18.
 */
@Mapper
public interface WechatBrowseTimeMapper {

    int addBrowseTime(WechatBrowseTime wechatBrowseTime);

    List<WechatBrowseTime> findByVisitBrowseId(@Param("visitBrowseId") String visitBrowseId);

    void updateBrowseTime(@Param("wechatBrowseTimes") List<WechatBrowseTime> wechatBrowseTimes, @Param("time") long time);
}
