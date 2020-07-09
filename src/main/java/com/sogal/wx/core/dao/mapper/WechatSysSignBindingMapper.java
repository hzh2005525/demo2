package com.sogal.wx.core.dao.mapper;

import com.sogal.wx.core.dao.domain.base.WechatRealm;
import com.sogal.wx.core.dao.domain.design.WechatDesign;
import com.sogal.wx.core.dao.domain.design.WechatDesignDetailDTO;
import com.sogal.wx.core.dao.domain.sign.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * Created by xiaoxuwang on 2019/3/7.
 */
@Mapper
public interface WechatSysSignBindingMapper {

   int bindingSigns(List<WechatSysSignBinding> bindings);

   int bindingSign(BindingSignDTO dto);

   List<BindingSignResultEntity> findAllSignByCondition(FindSignCondition findSignCondition);

   List<String> findSysSignsByDesignIdSysTypes(@Param("sysSigns")List<String> sysSigns, @Param("designId")String designId);

   List<WechatDesign> findRecommendDesignBySysSigns(@Param("designId")String designId,
                                                    @Param("sysSigns")List<String> sysSigns,
                                                    @Param("signIds")List<String> signIds,
                                                    @Param("pageStart")int pageStart,
                                                    @Param("pageSize")int pageSize,
                                                    @Param("dto")WechatDesignDetailDTO dto);

   List<WechatSysSign> findSignsByDesignId(@Param("designId")String designId);

   int deleteBindingSign(@Param("id")String id);

   int deleteBindingSignBySignIds(List<String> signIds);

   List<WechatSysSignBinding> findSignBindingBySignId(SignBindingEntitiesDTO dto);

   int findSignBindingCount(@Param("signId")String signId);

    void batchUpdateWechatSysSignBindingSignType(@Param("signIds") List<String> sysSignIds,
                                                 @Param("signType") String sysSignType);

   List<String> findCmsTagBindingIdsToBeDeleted(@Param("realm") WechatRealm realm,
                                                @Param("realmId") String realmId,
                                                @Param("wechatSysSignBindings") List<WechatSysSignBinding> wechatSysSignBindings);

   void deleteCmsTagBindingsByIds(@Param("ids") List<String> ids);
}
