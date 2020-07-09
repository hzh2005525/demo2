package com.sogal.wx.core.qrcode;

import com.sogal.wx.core.dao.domain.huabao.CMSHuaBao;
import com.sogal.wx.core.dao.domain.share.ShareTemplate;
import lombok.Data;

import java.io.File;
import java.io.InputStream;

/**
 * Created by xiaoxuwang on 2019/2/27.
 */
@Data
public class QRCodeBody {

//    private QRCodeRealmType type;
    private String type;
    private String realmUniqNo;
    /**
     * 与查看分享、扫码分享关联id
     */
    private String scene;
    private String shareUrl;

    private String realmPicUrl;
    private String realmTitle;

    private InputStream inputStream;
    private byte[] bytes;
    private File file;
    private String path;
    private String md5;
    private String ghostRelativePath;
    private String fileExt;
    private String realFileName;

    private String sharerName;
    private String sharerUrl;

    private ShareTemplate shareTemplate;

    private CMSHuaBao cmsHuaBao;

    private String sharerNickName;

    private String sharerMobile;

    private String qrcodeUrl;

    //base
    public QRCodeBody(String type, String realmUniqNo){
        this.type = type;
        this.realmUniqNo = realmUniqNo;
    }

    //with background
    public QRCodeBody(String type, String realmUniqNo, String realmPicUrl, String realmTitle){
        this.type = type;
        this.realmUniqNo = realmUniqNo;
        this.realmPicUrl = realmPicUrl;
        this.realmTitle = realmTitle;
    }
    public QRCodeBody(){

    }
}
