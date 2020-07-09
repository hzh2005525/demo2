package com.sogal.wx.core.dao.mapper;

import com.sogal.wx.core.dao.domain.base.WechatCategory;
import com.sogal.wx.core.dao.domain.base.WechatLogType;
import com.sogal.wx.core.dao.domain.base.WechatServer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Map;


/**
 * Created by xiaoxuwang on 2019/2/25.
 */
@Mapper
public interface WechatLogBackupsMapper {

    int addLogBackups(@Param("id")String id,
                      @Param("logType")WechatLogType logType,
                      @Param("server")WechatServer server,
                      @Param("payload")Map<String, Object> payload,
                      @Param("category")WechatCategory category);

}
