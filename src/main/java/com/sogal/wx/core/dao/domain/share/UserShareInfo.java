package com.sogal.wx.core.dao.domain.share;

import com.sogal.common.util.StringUtil;
import com.sogal.wx.core.dao.domain.base.WechatRealm;
import com.sogal.wx.core.qrcode.QRCodeBody;
import lombok.Data;

/**
 * Created by xiaoxuwang on 2019/3/1.
 */
@Data
public class UserShareInfo {

    private QRCodeBody qrCodeBody;
    private String userNo;
    private String realmNo;
//    private WechatRealm realm;
    private String realm;

    private ShareMethod method;
    private String id;

    /**
     * 与查看分享、扫码分享关联id
     */
    private String shareRecordId;
    /**
     * 版本号
     */
    private String version;

    public UserShareInfo(){
        this.id = StringUtil.uuid();
    }

    public UserShareInfo(String realm){
        this.id = StringUtil.uuid();
        this.realm = realm;
    }


}
