package com.sogal.wx.core.qrcode;

import com.sogal.common.exception.BizException;

/**
 * Created by xiaoxuwang on 2019/2/27.
 */
public interface QRCodeDrawingBoard {

    QRCodeBody drawQRCode(QRCodeBody qrCodeBody)throws BizException;

}
