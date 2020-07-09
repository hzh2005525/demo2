package com.sogal.wx.core.config;

import com.sogal.wx.core.qrcode.*;
import com.sogal.wx.core.qrcode.builder.*;
import org.springframework.context.annotation.Bean;

/**
 * Created by xiaoxuwang on 2019/2/27.
 */
public class QRCodeConfig {

    @Bean(name="baseQRCode")
    public QRCodeDrawingBoard getBaseQRCode(){
        return new BaseQRCode();
    }

    @Bean(name="storageQRCode")
    public QRCodeDrawingBoard getStorageQRCode(){
        return new StorageQRCode();
    }

    @Bean(name="paramDecorateQRCode")
    public QRCodeDrawingBoard getParamDecorateQRCode(){
        return new ParamDecorateQRCode();
    }

    @Bean(name="hbDecorateQRCode")
    public QRCodeDrawingBoard getHBDecorateQRCode(){
        return new HBDecorateQRCode();
    }

    @Bean(name="paramBackgroundQRCodeBuilder")
    public QRCodeBuilder getParamBackgroundQRCodeBuilder(){
        return new ParamBackgroudQRCodeBuilder();
    }

    @Bean(name="hbQrCodeBuilder")
    public QRCodeBuilder getHBQRCodeBuilder(){
        return new HBQRCodeBuilder();
    }

}
