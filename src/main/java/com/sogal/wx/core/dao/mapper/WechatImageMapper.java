package com.sogal.wx.core.dao.mapper;

import com.sogal.wx.core.dao.domain.base.WechatRealm;
import com.sogal.wx.core.dao.domain.image.WechatImage;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by xiaoxuwang on 2019/3/1.
 */
@Mapper
public interface WechatImageMapper {

    int addWechatImage(WechatImage wechatImage);

    int addWechatImages(List<WechatImage> wechatImages);

    WechatImage findEntityById(@Param("id")String id);

    void replaceWechatDesignCover(WechatImage wechatImage);

    int deleteImage(@Param("id")String id);

    int deleteImageByIds(List<String> ids);

    List<WechatImage> findByRealmAndRealmId(@Param("realm")String realm,@Param("realmId")String realmId);
}
