package com.sogal.wx.core.dao.domain.image;

import com.sogal.wx.core.dao.domain.base.BaseEntity;
import com.sogal.wx.core.dao.domain.base.WechatRealm;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by xiaoxuwang on 2019/2/20.
 */
@Getter
@Setter
public class WechatImage extends BaseEntity{

    @ApiModelProperty("图片路径")
    private String imageUrl;
    @ApiModelProperty("图片MD5")
    private String imageMd5;
    @ApiModelProperty("图片压缩后url")
    private String reduceUrl;
    @ApiModelProperty("图片真实名字")
    private String name;
    @ApiModelProperty("扩展名")
    private String ext;
    @ApiModelProperty("图片归属实体")
    private WechatRealm realm;
    @ApiModelProperty("图片归属实体ID")
    private String realmId;
    @ApiModelProperty("图片大小")
    private Integer size = 0;
    private FileStorageStrategy fileStorageStrategy;
    private int day;

    public WechatImage(){}

    public WechatImage(String imageUrl, String imageMd5, String reduceUrl, String name, String ext, WechatRealm realm, String realmId, String creator){
        this.imageUrl = imageUrl;
        this.imageMd5 = imageMd5;
        this.reduceUrl = reduceUrl;
        this.name = name;
        this.ext = ext;
        this.realm = realm;
        this.realmId = realmId;
        this.setCreator(creator);
    }

    public WechatImage(String imageUrl, String imageMd5, String reduceUrl, String ext, WechatRealm realm, String realmId, String creator){
        this.imageUrl = imageUrl;
        this.imageMd5 = imageMd5;
        this.reduceUrl = reduceUrl;
        this.ext = ext;
        this.realm = realm;
        this.realmId = realmId;
        this.setCreator(creator);
    }



}
