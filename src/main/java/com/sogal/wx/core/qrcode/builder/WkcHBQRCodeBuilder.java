package com.sogal.wx.core.qrcode.builder;

import com.sogal.common.exception.BizException;
import com.sogal.wx.core.dao.domain.huabao.CMSHuaBao;
import com.sogal.wx.core.dao.domain.share.ShareMethod;
import com.sogal.wx.core.qrcode.QRCodeBody;
import com.sogal.wx.core.qrcode.QRCodeDrawingBoard;
import com.sogal.wx.core.qrcode.builder.QRCodeBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class WkcHBQRCodeBuilder implements QRCodeBuilder {

    @Autowired
    @Qualifier("wkcBaseQRCode")
    private QRCodeDrawingBoard baseQRCode;
    @Autowired
    @Qualifier("hbDecorateQRCode")
    private QRCodeDrawingBoard hbDecorateQRCode;

    @Autowired
    @Qualifier("storageQRCode")
    private QRCodeDrawingBoard storageQRCode;
    @Override
    public QRCodeBody build(QRCodeBody qrCodeBody) throws BizException {
        CMSHuaBao cmsHuaBao = qrCodeBody.getCmsHuaBao();
        if(null != cmsHuaBao && ShareMethod.WECHAT_SERVICE_ACCOUNT.name().equals(cmsHuaBao.getShareCodeType())){
            return storageQRCode.drawQRCode(hbDecorateQRCode.drawQRCode(qrCodeBody));
        }else if(null != cmsHuaBao && ShareMethod.POSTER_QRCODE.name().equals(cmsHuaBao.getShareCodeType())){
            return storageQRCode.drawQRCode(hbDecorateQRCode.drawQRCode(qrCodeBody));
        }else {
            return storageQRCode.drawQRCode(hbDecorateQRCode.drawQRCode(baseQRCode.drawQRCode(qrCodeBody)));
        }
    }
}
