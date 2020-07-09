package com.sogal.wx.core.dao.domain.share;

import com.sogal.wx.core.dao.domain.base.BaseEntity;
import com.sogal.wx.core.dao.domain.base.WechatRealm;
import lombok.Data;

/**
 * Created by xiaoxuwang on 2019/3/11.
 */
@Data
public class WechatCheckShare extends BaseEntity{

    private ShareMethod method;
//    private WechatRealm type;
    private String type;
    private String shareNo;
    private String sharerNo;
    private String checkerNo;
    private Boolean newbee;

    private String shareRecordId;

    public WechatCheckShare(){}

    public WechatCheckShare(ShareMethod method, String type, String shareNo, String sharerNo, String checkerNo){
        this.method = method;
        this.type = type;
        this.shareNo = shareNo;
        this.sharerNo = sharerNo;
        this.checkerNo = checkerNo;
    }

    public WechatCheckShare(ShareMethod method, String type, String shareNo, String sharerNo, String checkerNo,
                            String shareRecordId){
        this.method = method;
        this.type = type;
        this.shareNo = shareNo;
        this.sharerNo = sharerNo;
        this.checkerNo = checkerNo;
        this.shareRecordId = shareRecordId;
    }

}
