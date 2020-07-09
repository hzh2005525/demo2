package com.sogal.wx.core.dao.mapper;

import com.sogal.wx.core.dao.domain.user.UserAuthBase;
import com.sogal.wx.core.dao.domain.user.WechatUser;
import org.apache.ibatis.annotations.Param;

public interface UserAuthBaseMapper {

    int addUserAuthBaseBySelective(WechatUser wechatUser);

    int deleteByUnionId(@Param("unionId") String unionId);

    UserAuthBase selectByUnionId(@Param("unionId") String unionId);

    UserAuthBase selectByUserNo(@Param("userNo") String userNo);

    String findUserNameByUnionId(@Param("unionId") String unionId);

}
