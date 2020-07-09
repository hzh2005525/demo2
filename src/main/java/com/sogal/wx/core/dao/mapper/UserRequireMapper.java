package com.sogal.wx.core.dao.mapper;

import com.sogal.wx.core.dao.domain.user.UserRequire;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 *  @Author : zhaojie
 *  @Description :
 *  @Date : 2019/10/17
 */
@Mapper
public interface UserRequireMapper {

    void insertUserRequireInfo(UserRequire info);

    UserRequire selectUserRequireInfoByRegisterId(@Param("registerId") String registerId);

    int countUserRequireSumbited(@Param("userId") String userId);
}
