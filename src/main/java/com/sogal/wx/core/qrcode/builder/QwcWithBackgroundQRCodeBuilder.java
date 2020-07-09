package com.sogal.wx.core.qrcode.builder;

import com.sogal.common.exception.BizException;
import com.sogal.wx.core.qrcode.QRCodeBody;
import com.sogal.wx.core.qrcode.QRCodeDrawingBoard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by xiaoxuwang on 2019/2/27.
 */
public class QwcWithBackgroundQRCodeBuilder implements QRCodeBuilder{

    @Autowired
    @Qualifier("qwcBaseQRCode")
    private QRCodeDrawingBoard baseQRCode;

    @Autowired
    @Qualifier("qwcDecorateQRCode")
    private QRCodeDrawingBoard decorateQRCode;

    @Autowired
    @Qualifier("storageQRCode")
    private QRCodeDrawingBoard storageQRCode;

    @Override
    public QRCodeBody build(QRCodeBody qrCodeBody)throws BizException {
        return storageQRCode.drawQRCode(decorateQRCode.drawQRCode(baseQRCode.drawQRCode(qrCodeBody)));
    }


}
