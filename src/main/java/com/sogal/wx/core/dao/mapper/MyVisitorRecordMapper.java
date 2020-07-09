package com.sogal.wx.core.dao.mapper;

import com.sogal.common.domain.criteria.PageInfo;
import com.sogal.wx.core.dao.domain.mine.*;
import com.sogal.wx.core.dao.domain.user.QueryUserExtendRecordCondition;
import com.sogal.wx.core.dao.domain.user.QueryUserVisitRecordCondition;
import com.sogal.wx.core.dao.domain.user.UserExtendRecordDTO;
import com.sogal.wx.core.dao.domain.user.UserVisitRecordDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MyVisitorRecordMapper {

    void addMyVisitorRecord(MyVisitorRecord myVisitorRecord);

    int findMyVisitorPointTotal(MyRecordDTO dto);

    String findLastSharerId(@Param("userId") String userId);

    List<MyVisitorRecordDTO> findVisitRecordByVisitorIdAtC(MyRecordDTO dto);

    int findVisitRecordTotalByVisitorIdAtC(MyRecordDTO dto);

    List<MyVisitorRecordDTO> findMyVisitorVisitRecordAtC(MyRecordDTO dto);

    int findMyVisitorVisitRecordTotalAtC(MyRecordDTO dto);

    List<UserExtendRecordDTO> findUserMpExtendRecord(QueryUserExtendRecordCondition queryCondition);

    int countUserMpExtendRecordTotalSize(QueryUserExtendRecordCondition queryCondition);

    List<UserVisitRecordDTO> findUserMpVisitRecord(@Param("userId") String userId,
                                                   @Param("pageInfo") PageInfo pageInfo,
                                                   @Param("queryCondition")
                                                           QueryUserVisitRecordCondition queryUserVisitRecordCondition);

    int countUserMpVisitRecord(@Param("userId") String userId,
                               @Param("queryCondition")
                                       QueryUserVisitRecordCondition queryUserVisitRecordCondition);

    List<MyFootMarkResultAtCDTO> findMyFootmarkAtC(MyFootMarkDTO myFootMarkDTO);

    int findMyFootmarkTotalSizeAtC(MyFootMarkDTO myFootMarkDTO);

    List<UserVisitRecordDTO> findUserVisitRecordByShareRecordIdAtadmin(QueryUserVisitRecordCondition queryCondition);

    int countUserVisitRecordTotalByShareRecordIdAtadmin(QueryUserVisitRecordCondition queryCondition);

    int countMpAccessRecordByVisiterAndDesignId(@Param("visiter") String visiter,
                                                @Param("designId") String designId,
                                                @Param("visitTime") String visitTime);

}
