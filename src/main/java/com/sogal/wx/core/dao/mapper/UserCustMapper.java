package com.sogal.wx.core.dao.mapper;

import com.sogal.wx.core.dao.domain.order.UserCust;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserCustMapper {
    List<String> findCustIdOfUserAtDspByUnionId(@Param("unionId") String unionId);

    void batchInsertIgnoreUserCust(List<UserCust> userCusts);

    int countNumAtDspByUnionIdAndCustId(@Param("unionId") String unionId,
                                        @Param("custId") String custId);
}
