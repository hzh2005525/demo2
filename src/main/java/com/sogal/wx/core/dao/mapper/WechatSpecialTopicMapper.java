package com.sogal.wx.core.dao.mapper;

import com.sogal.common.domain.criteria.PageInfo;
import com.sogal.wx.core.dao.domain.special.SpecialDesignQueryCondition;
import com.sogal.wx.core.dao.domain.special.SpecialTopicQueryCondition;
import com.sogal.wx.core.dao.domain.special.WechatSpecialTopic;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface WechatSpecialTopicMapper {

    int insert(WechatSpecialTopic wechatSpecialTopic);

    int updateById(WechatSpecialTopic wechatSpecialTopic);

    int deleteById(WechatSpecialTopic wechatSpecialTopic);

    int publishORCancelById(WechatSpecialTopic wechatSpecialTopic);

    List<WechatSpecialTopic> list(@Param("specialTopicQueryCondition")
                                          SpecialTopicQueryCondition specialTopicQueryCondition,
                                  @Param("pageInfo") PageInfo pageInfo);

    int count(@Param("specialTopicQueryCondition") SpecialTopicQueryCondition specialTopicQueryCondition);

    List<Map<String, String>> getSpecialTopicListByKind(@Param("kind") String kind);

    WechatSpecialTopic selectById(@Param("id") String id);

    int updateDesignCountPlusById(@Param("id") String id);

    int updateDesignCountReduceById(@Param("id") String id);

    List<Map<String, String>> articleList(@Param("specialDesignQueryCondition")
                                                  SpecialDesignQueryCondition specialDesignQueryCondition,
                                          @Param("pageInfo") PageInfo pageInfo);

    int articleListCount(@Param("specialDesignQueryCondition") SpecialDesignQueryCondition specialDesignQueryCondition);

    List<WechatSpecialTopic> appletTopicList(@Param("specialTopicQueryCondition")
                                                SpecialTopicQueryCondition specialTopicQueryCondition);

}