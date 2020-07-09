package com.sogal.wx.core.dao.mapper;

import com.sogal.wx.core.dao.domain.search.WechatSearchRecord;
import com.sogal.wx.core.dao.domain.search.WechatSearchRecordQueryCondition;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WechatSearchRecordMapper {

    int insert(WechatSearchRecord wechatSearchRecord);

    int updateByUniqueKey(WechatSearchRecord wechatSearchRecord);

    List<WechatSearchRecord> listLimitTen(@Param("wechatSearchRecordQueryCondition")
                                                  WechatSearchRecordQueryCondition wechatSearchRecordQueryCondition);

    WechatSearchRecord selectByUniqueKey(@Param("userNo") String userNo,
                                         @Param("keyWord") String keyWord);

}
