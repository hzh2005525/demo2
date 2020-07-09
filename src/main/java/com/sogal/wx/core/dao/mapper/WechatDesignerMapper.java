package com.sogal.wx.core.dao.mapper;

import com.sogal.common.domain.criteria.PageInfo;
import com.sogal.wx.core.dao.domain.designer.DesignerQueryCondition;
import com.sogal.wx.core.dao.domain.designer.WechatDesigner;
import com.sogal.wx.core.dao.domain.designer.WechatDesignerDetailDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface WechatDesignerMapper {

    void insertWechatDesigner(WechatDesigner wechatDesigner);

    WechatDesigner findWechatDesignerByUnionId(@Param("unionId") String unionId);

    List<WechatDesignerDetailDTO> findDesignersListAtAdmin(@Param("queryCondition")
                                                                   DesignerQueryCondition designerQueryCondition,
                                                           @Param("pageInfo") PageInfo pageInfo);

    int countDesignersListAtAdmin(@Param("queryCondition") DesignerQueryCondition designerQueryCondition);

    List<WechatDesigner> findDesignersPagedAtAdmin(@Param("queryCondition")
                                                           DesignerQueryCondition designerQueryCondition,
                                                   @Param("pageInfo") PageInfo pageInfo);

    int countDesignersPagedAtAdmin(@Param("queryCondition") DesignerQueryCondition designerQueryCondition);

    void cancelDesignerAuth(WechatDesigner wechatDesigner);

    WechatDesignerDetailDTO findDesignerDetailByIdAtC(@Param("designerId") String designerId);

    void reAuthDesigner(WechatDesigner wechatDesigner);

    List<Map<String, Object>> listLimit(@Param("type") String type, @Param("showNum") int showNum);

    List<Map<String, Object>> findRightRecommendDesignersList(@Param("designerQueryCondition")
                                                                      DesignerQueryCondition designerQueryCondition,
                                                              @Param("pageInfo") PageInfo pageInfo);

    int countRightRecommendDesignersList(@Param("designerQueryCondition") DesignerQueryCondition designerQueryCondition);

    List<Map<String, Object>> findLeftRecommendDesignersList();

    Integer getMaxOrderNum();

    int updateShift(WechatDesigner wechatDesigner);

    List<WechatDesigner> getDragAndDropIdList(@Param("type") String type,
                                              @Param("min") Integer min,
                                              @Param("max") Integer max);

    WechatDesigner findWechatDesignerByUserId(@Param("userId") String userId);

}
