package com.sogal.wx.core.dao.mapper;

import com.sogal.wx.core.dao.domain.share.WechatShare;
import com.sogal.wx.core.dao.domain.user.QueryUserShareRecordCondition;
import com.sogal.wx.core.dao.domain.user.UserShareRecordDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface WechatShareMapper {

    int addUserShare(WechatShare wechatShare);

    String findUserShare(WechatShare wechatShare);

    String findQRCodeContentByShareRecordId(@Param("shareRecordId") String shareRecordId);

    WechatShare findUserShareByShareRecordId(@Param("shareRecordId") String shareRecordId);

    List<UserShareRecordDTO> findMpUserShareRecordAtmin(QueryUserShareRecordCondition queryCondition);

    int countMpUserShareRecordTotalSizeAtmin(QueryUserShareRecordCondition queryCondition);

}
