package com.sogal.wx.core.qrcode.builder;

import com.sogal.common.exception.BizException;
import com.sogal.wx.core.dao.domain.share.ShareMethod;
import com.sogal.wx.core.dao.domain.share.ShareTemplate;
import com.sogal.wx.core.qrcode.QRCodeBody;
import com.sogal.wx.core.qrcode.QRCodeDrawingBoard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class WkcParamBackgroudQRCodeBuilder implements QRCodeBuilder {

    @Autowired
    @Qualifier("wkcBaseQRCode")
    private QRCodeDrawingBoard baseQRCode;
    @Autowired
    @Qualifier("wkcParamDecorateQRCode")
    private QRCodeDrawingBoard paramDecorateQRCode;

    @Autowired
    @Qualifier("storageQRCode")
    private QRCodeDrawingBoard storageQRCode;
    @Override
    public QRCodeBody build(QRCodeBody qrCodeBody) throws BizException {
        ShareTemplate shareTemplate = qrCodeBody.getShareTemplate();
        if(null != shareTemplate && ShareMethod.WECHAT_SERVICE_ACCOUNT.name().equals(shareTemplate.getAppletCodeType())){
            return storageQRCode.drawQRCode(paramDecorateQRCode.drawQRCode(qrCodeBody));
        }else if(null != shareTemplate && ShareMethod.POSTER_QRCODE.name().equals(shareTemplate.getAppletCodeType())){
            return storageQRCode.drawQRCode(paramDecorateQRCode.drawQRCode(qrCodeBody));
        }else {
            return storageQRCode.drawQRCode(paramDecorateQRCode.drawQRCode(baseQRCode.drawQRCode(qrCodeBody)));
        }
    }
}
