package com.sogal.wx.core.dao.mapper;

import com.sogal.common.domain.appletc.UserCustOrder;
import com.sogal.common.domain.criteria.PageInfo;
import com.sogal.wx.core.dao.domain.order.UserCust;
import com.sogal.wx.core.dao.domain.order.UserOrderDetailResultAtC;
import com.sogal.wx.core.dao.domain.order.UserOrderResultPagedAtAdmin;
import com.sogal.wx.core.dao.domain.order.UserOrderResultPagedAtC;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface WechatUserOrderMapper {
    void batchReplaceInto(List<UserCustOrder> userCustOrderList);

    List<UserCust> findUserCustRelationNotEstablished();

    void batchInsertIgnoreUserCust(List<UserCust> userCusts);

    List<UserOrderResultPagedAtC> findUserOrderPagedAtC(@Param("userId") String userId,
                                                        @Param("pageInfo") PageInfo pageInfo);

    int countTotalSizeOfUserOrderPagedAtC(@Param("userId") String userId);

    UserOrderDetailResultAtC findUserOrderDetailInfoAtC(@Param("userOrderId") String userOrderId,
                                                        @Param("userId") String userId);

    void updateUserOrderKJLInfo(UserCustOrder userCustOrder);

    List<UserOrderResultPagedAtAdmin> findMyOrdersInfoAtAdmin(@Param("userId") String userId);

    int countCustsAssociatedByUnionId(@Param("unionId") String unionId);

    List<UserCust> findUserCustRelationNotEstablishedByUserIdAndMobile(@Param("mobile") String mobile,
                                                                       @Param("userId") String userId);
}
