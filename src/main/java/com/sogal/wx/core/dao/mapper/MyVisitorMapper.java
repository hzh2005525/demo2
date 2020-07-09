package com.sogal.wx.core.dao.mapper;

import com.sogal.wx.core.dao.domain.mine.MineCustomer;
import com.sogal.wx.core.dao.domain.mine.MyRecordDTO;
import com.sogal.wx.core.dao.domain.mine.MyVisitor;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MyVisitorMapper {

    void addMyVisitor(MyVisitor myVisitor);

    List<String> findMyVisitorIds(MyRecordDTO servantId);

    int findMyVisitorTotal(MyRecordDTO dto);

    List<MineCustomer> findMyVisitors(MyRecordDTO dto);

}
