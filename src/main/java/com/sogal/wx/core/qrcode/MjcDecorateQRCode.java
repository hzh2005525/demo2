package com.sogal.wx.core.qrcode;

import com.sogal.common.exception.BizException;
import com.sogal.wx.core.error.WechatCoreError;
import com.sogal.wx.core.tool.DrawPicTool;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

/**
 * Created by xiaoxuwang on 2019/2/27.
 */
@Slf4j
public class MjcDecorateQRCode implements QRCodeDrawingBoard{

    @Value("${image.server.host}")
    private String host;

    @Value("${image.server.relative}")
    private String relative;

    @Value("${image.mjc.background}")
    private String imageBackground;

    @Override
    public QRCodeBody drawQRCode(QRCodeBody qrCodeBody) throws BizException {
        ClassPathResource redResource = new ClassPathResource(imageBackground);
        BufferedImage red = null;
        URL picUrl = null;
        try {
            red = ImageIO.read(redResource.getInputStream());
            log.info(host + relative + qrCodeBody.getRealmPicUrl());
//            picUrl = new URL(host + "/wx/image" + relative + qrCodeBody.getRealmPicUrl());
            picUrl = new URL(host + relative + qrCodeBody.getRealmPicUrl());
            BufferedImage realmPic = ImageIO.read(picUrl);
            BufferedImage qrCodePic = ImageIO.read(qrCodeBody.getFile());
            BufferedImage backPic = new BufferedImage(red.getWidth(), red.getHeight(), BufferedImage.TYPE_4BYTE_ABGR_PRE);
            DrawPicTool.drawImgInImg(backPic, red, 0, 0, red.getWidth(), red.getHeight());
            DrawPicTool.drawImgInImg(backPic, realmPic, 0, 0, 750, 605);
            DrawPicTool.drawImgInImg(backPic, qrCodePic, 470, 740, 260, 260);
            DrawPicTool.drawTextInImg(backPic, qrCodeBody.getRealmTitle(), 43, 700, 650);
            if(!StringUtils.isBlank(qrCodeBody.getSharerName())) {
                DrawPicTool.drawTextInImg(backPic, qrCodeBody.getSharerName(), 123, 956, 250,28, new Color(144, 147, 153, 149));
            }
            if(!StringUtils.isBlank(qrCodeBody.getSharerUrl())){
                try{
                URL avUrl = new URL(qrCodeBody.getSharerUrl());
                BufferedImage avPic = ImageIO.read(avUrl);
                DrawPicTool.drawImgInImg(backPic, avPic, 48, 918, 50, 50);
                }catch (Exception e){
                    log.warn("获取微信头像失败！", e);
                }
            }
            BufferedImage result = new BufferedImage(backPic.getWidth(), backPic.getHeight(), BufferedImage.TYPE_3BYTE_BGR);
            result.getGraphics().drawImage(backPic, 0, 0, null);
            ByteArrayOutputStream bs = new ByteArrayOutputStream();
            ImageIO.write(result, "jpg", bs);
            byte[] bytes = bs.toByteArray();
            qrCodeBody.setBytes(bytes);
            ByteArrayInputStream inputStream = new ByteArrayInputStream(bytes);
            FileOutputStream fs = new FileOutputStream(qrCodeBody.getFile());
            fs.write(bytes);
            qrCodeBody.setInputStream(inputStream);
        }catch (IOException e){
            log.error(this.getClass().getName(), e);
            throw new BizException(WechatCoreError.READ_FILE_FAIL);
        }
        return qrCodeBody;
    }

}
