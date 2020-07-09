package com.sogal.wx.core.dao.mapper;

import com.sogal.wx.core.dao.domain.special.WechatSpecialDesign;
import org.apache.ibatis.annotations.Param;

public interface WechatSpecialDesignMapper {

    int insert(WechatSpecialDesign wechatSpecialDesign);

    int deleteBySpecialIdAndDesignId(@Param("specialId") String specialId, @Param("designId") String designId);

}
