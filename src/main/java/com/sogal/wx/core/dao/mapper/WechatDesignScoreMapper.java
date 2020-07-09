package com.sogal.wx.core.dao.mapper;

import com.sogal.wx.core.dao.domain.design.WechatDesignScore;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by xiaoxuwang on 2019/3/8.
 */
@Mapper
public interface WechatDesignScoreMapper {

    int deleteAll();

    int insertWechatDesignScores(List<WechatDesignScore> designScoreList);

}
