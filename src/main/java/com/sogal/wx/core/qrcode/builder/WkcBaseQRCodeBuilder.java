package com.sogal.wx.core.qrcode.builder;

import com.sogal.common.exception.BizException;
import com.sogal.wx.core.qrcode.QRCodeBody;
import com.sogal.wx.core.qrcode.QRCodeDrawingBoard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class WkcBaseQRCodeBuilder implements QRCodeBuilder {

    @Autowired
    @Qualifier("wkcBaseQRCode")
    private QRCodeDrawingBoard baseQRCode;

    @Autowired
    @Qualifier("storageQRCode")
    private QRCodeDrawingBoard storageQRCode;

    @Override
    public QRCodeBody build(QRCodeBody qrCodeBody) throws BizException {
        return storageQRCode.drawQRCode(baseQRCode.drawQRCode(qrCodeBody));
    }

}
