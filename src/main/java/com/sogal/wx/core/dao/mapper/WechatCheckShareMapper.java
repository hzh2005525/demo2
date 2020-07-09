package com.sogal.wx.core.dao.mapper;

import com.sogal.wx.core.dao.domain.share.WechatCheckShare;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by xiaoxuwang on 2019/3/11.
 */
@Mapper
public interface WechatCheckShareMapper {

    int addWechatCheckShare(WechatCheckShare wechatCheckShare);

}
