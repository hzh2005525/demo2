package com.sogal.wx.core.dao.mapper;

import com.sogal.common.domain.criteria.PageInfo;
import com.sogal.wx.core.dao.domain.mine.MyCollectSignDTO;
import com.sogal.wx.core.dao.domain.mine.MyCollectSignResult;
import com.sogal.wx.core.dao.domain.mine.MyCollection;
import com.sogal.wx.core.dao.domain.mine.MyCollectionResultAtAdmin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MyCollectionMapper {
    int addMyCollection(MyCollection myCollection);

    int deleteMyCollection(MyCollection myCollection);

    MyCollection findMyCollectionByUniq(MyCollection myCollection);

    List<MyCollectSignResult> findSignMyCollected(MyCollectSignDTO myCollectSignDTO);

    int findSignMyCollectedTotal(MyCollectSignDTO myCollectSignDTO);

    List<MyCollectionResultAtAdmin> findMyCollectInfoAtAdmin(@Param("userId") String userId,
                                                             @Param("pageInfo") PageInfo pageInfo,
                                                             @Param("isPaged") Boolean isPaged);

    int findMyCollectInfoTotalSizeAtAdmin(@Param("userId") String userId);
}
