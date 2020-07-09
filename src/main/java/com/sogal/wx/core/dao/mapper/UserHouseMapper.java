package com.sogal.wx.core.dao.mapper;

import com.sogal.wx.core.dao.domain.user.UserHouse;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface UserHouseMapper {


    int countUserHouseNumByUnionIdAndHouseIdAtC(@Param("unionId") String unionId,
                                                @Param("houseId") String houseId);

    void insertIgnoreUserCust(UserHouse userHouse);

    List<UserHouse> selectUserHouseListBySharerNo(@Param("sharerNo") String sharerNo);

    List<UserHouse> selectUserHouseListByUserId(@Param("userId") String userId);

}
