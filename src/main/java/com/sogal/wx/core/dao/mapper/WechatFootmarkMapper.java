package com.sogal.wx.core.dao.mapper;

import com.sogal.wx.core.dao.domain.footmark.WechatFootmark;
import com.sogal.wx.core.dao.domain.mine.MyRecordDTO;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by xiaoxuwang on 2019/3/5.
 */
@Mapper
public interface WechatFootmarkMapper {

    int addWechatFootmark(WechatFootmark wechatFootmark);

    int deleteWechatFootMark(WechatFootmark wechatFootmark);

    int findMyVisitorPointTotal(MyRecordDTO dto);

}
