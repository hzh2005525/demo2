package com.sogal.wx.core.qrcode.builder;

import com.sogal.common.exception.BizException;
import com.sogal.wx.core.qrcode.QRCodeBody;

/**
 * Created by xiaoxuwang on 2019/2/27.
 */
public interface QRCodeBuilder {

    QRCodeBody build(QRCodeBody qrCodeBody)throws BizException;

}
