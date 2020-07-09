package com.sogal.wx.core.config;

import com.sogal.wx.core.qrcode.*;
import com.sogal.wx.core.qrcode.builder.*;
import org.springframework.context.annotation.Bean;

public class MpQRCodeConfig {

    @Bean(name="wkcBaseQRCode")
    public QRCodeDrawingBoard getWkcBaseQRCode(){
        return new WkcBaseQRCode();
    }

    @Bean(name="qwcBaseQRCode")
    public QRCodeDrawingBoard getQwcBaseQRCode(){
        return new QwcBaseQRCode();
    }

    @Bean(name="mjcBaseQRCode")
    public QRCodeDrawingBoard getMjcBaseQRCode(){
        return new MjcBaseQRCode();
    }


    @Bean(name="storageQRCode")
    public QRCodeDrawingBoard getStorageQRCode(){
        return new StorageQRCode();
    }


    @Bean(name="wkcDecorateQRCode")
    public QRCodeDrawingBoard getWkcDecorateQRCode(){
        return new WkcDecorateQRCode();
    }

    @Bean(name="qwcDecorateQRCode")
    public QRCodeDrawingBoard getQwcDecorateQRCode(){
        return new QwcDecorateQRCode();
    }

    @Bean(name="mjcDecorateQRCode")
    public QRCodeDrawingBoard getMjcDecorateQRCode(){
        return new MjcDecorateQRCode();
    }


    @Bean(name="wkcParamDecorateQRCode")
    public QRCodeDrawingBoard getWkcParamDecorateQRCode(){
        return new WkcParamDecorateQRCode();
    }

    @Bean(name="qwcParamDecorateQRCode")
    public QRCodeDrawingBoard getQwcParamDecorateQRCode(){
        return new QwcParamDecorateQRCode();
    }

    @Bean(name="mjcParamDecorateQRCode")
    public QRCodeDrawingBoard getMjcParamDecorateQRCode(){
        return new MjcParamDecorateQRCode();
    }


    @Bean(name="hbDecorateQRCode")
    public QRCodeDrawingBoard getHBDecorateQRCode(){
        return new HBDecorateQRCode();
    }


    @Bean(name="wkcBaseQRCodeBuilder")
    public QRCodeBuilder getWkcBaseQRCodeBuilder(){
        return new WkcBaseQRCodeBuilder();
    }

    @Bean(name="qwcBaseQRCodeBuilder")
    public QRCodeBuilder getQwcBaseQRCodeBuilder(){
        return new QwcBaseQRCodeBuilder();
    }

    @Bean(name="mjcBaseQRCodeBuilder")
    public QRCodeBuilder getMjcBaseQRCodeBuilder(){
        return new MjcBaseQRCodeBuilder();
    }


    @Bean(name="wkcWithBackgroundQRCodeBuilder")
    public QRCodeBuilder getWkcWithBackgroundQRCodeBuilder(){
        return new WkcWithBackgroundQRCodeBuilder();
    }

    @Bean(name="qwcWithBackgroundQRCodeBuilder")
    public QRCodeBuilder getQwcWithBackgroundQRCodeBuilder(){
        return new QwcWithBackgroundQRCodeBuilder();
    }

    @Bean(name="mjcWithBackgroundQRCodeBuilder")
    public QRCodeBuilder getMjcWithBackgroundQRCodeBuilder(){
        return new MjcWithBackgroundQRCodeBuilder();
    }


    @Bean(name="wkcParamBackgroudQRCodeBuilder")
    public QRCodeBuilder getWkcParamBackgroudQRCodeBuilder(){
        return new WkcParamBackgroudQRCodeBuilder();
    }

    @Bean(name="qwcParamBackgroudQRCodeBuilder")
    public QRCodeBuilder getQwcParamBackgroudQRCodeBuilder(){
        return new QwcParamBackgroudQRCodeBuilder();
    }

    @Bean(name="mjcParamBackgroudQRCodeBuilder")
    public QRCodeBuilder getMjcParamBackgroudQRCodeBuilder(){
        return new MjcParamBackgroudQRCodeBuilder();
    }


    @Bean(name="wkcHBQRCodeBuilder")
    public QRCodeBuilder getWkcHBQRCodeBuilder(){
        return new WkcHBQRCodeBuilder();
    }

    @Bean(name="qwcHBQRCodeBuilder")
    public QRCodeBuilder getQwcHBQRCodeBuilder(){
        return new QwcHBQRCodeBuilder();
    }

    @Bean(name="mjcHBQRCodeBuilder")
    public QRCodeBuilder getMjcHBQRCodeBuilder(){
        return new MjcHBQRCodeBuilder();
    }

}
