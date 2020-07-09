package com.sogal.wx.core.qrcode;

import com.sogal.common.exception.BizException;
import com.sogal.wx.core.dao.domain.share.ShareMethod;
import com.sogal.wx.core.dao.domain.share.ShareTemplate;
import com.sogal.wx.core.error.WechatCoreError;
import com.sogal.wx.core.tool.DrawPicTool;
import com.sogal.wx.core.tool.EmojiUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
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
import java.nio.file.Files;

@Slf4j
public class MjcParamDecorateQRCode implements QRCodeDrawingBoard{

    @Value("${image.server.host}")
    private String host;

    @Value("${image.server.relative}")
    private String relative;

    @Value("${image.mjc.background}")
    private String imageBackground;


    @Override
    public QRCodeBody drawQRCode(QRCodeBody qrCodeBody) throws BizException {
//        String  wxImagePathStr=  "/wx/image";
//        String hostproducer ="http://ftp.sfygroup.shop";
        ClassPathResource redResource = new ClassPathResource(imageBackground);
        BufferedImage red = null;
        URL picUrl = null;
        ShareTemplate shareTemplate = qrCodeBody.getShareTemplate();
        BufferedImage bgPic = null;
        URL bgPicUrl = null;
        if(null != shareTemplate){
            try {
                log.info("shareTemplate={}",shareTemplate.toString());
                log.info(host + relative + shareTemplate.getBackgroundImage());
                try{
                    bgPicUrl = new URL(host  + relative + shareTemplate.getBackgroundImage());
                    bgPic = ImageIO.read(bgPicUrl);
                }catch (Exception e){
                    log.warn("生成海报时读取模板背景图失败");
                    throw new Exception("生成海报时读取模板背景图失败",e);
                }

//                if(StringUtils.isNotBlank(qrCodeBody.getRealmPicUrl()) && qrCodeBody.getRealmPicUrl().startsWith("http")){
//                    picUrl = new URL(qrCodeBody.getRealmPicUrl());
//                }else {
//                     picUrl = new URL(host + relative + qrCodeBody.getRealmPicUrl());
//                }
//                BufferedImage realmPic = ImageIO.read(picUrl);
                BufferedImage qrCodePic;
                if(ShareMethod.WECHAT_SERVICE_ACCOUNT.name().equals(shareTemplate.getAppletCodeType())){
                    URL qrCodePicUrl = new URL(qrCodeBody.getQrcodeUrl());
                     qrCodePic = ImageIO.read(qrCodePicUrl);
                }else {
                     qrCodePic = ImageIO.read(qrCodeBody.getFile());
                }
                BufferedImage backPic = new BufferedImage(shareTemplate.getPosterWidth(),shareTemplate.getPosterHigh(),
                        BufferedImage.TYPE_4BYTE_ABGR_PRE);
                DrawPicTool.drawImgInImg(backPic, bgPic, 0, 0, shareTemplate.getPosterWidth(),
                        shareTemplate.getPosterHigh());
                if(shareTemplate.getArticleImageValid()){
                    log.info("文章配图开始draw = {}",shareTemplate.getArticleImageValid());
                     if(StringUtils.isNotBlank(qrCodeBody.getRealmPicUrl()) && qrCodeBody.getRealmPicUrl().startsWith("http")){
                        picUrl = new URL(qrCodeBody.getRealmPicUrl());
                    }else {
                         picUrl = new URL(host + relative + qrCodeBody.getRealmPicUrl());
                    }
                    BufferedImage realmPic = ImageIO.read(picUrl);
                    DrawPicTool.drawImgInImg(backPic, realmPic, shareTemplate.getArticleImageX(),
                            shareTemplate.getArticleImageY(),shareTemplate.getArticleImageWidth(),
                            shareTemplate.getArticleImageHigh());
                    log.info("文章配图宽度={}，高度={}",shareTemplate.getArticleImageWidth(),
                            shareTemplate.getArticleImageHigh());
                }
                if(shareTemplate.getArticleTitleValid()){
                    log.info("文章标题开始draw = {}",shareTemplate.getArticleTitleValid());
                    DrawPicTool.drawTextWithFontHeightInImg(backPic,qrCodeBody.getRealmTitle(),
                            shareTemplate.getArticleTitleX(),shareTemplate.getArticleTitleY(),650,
                            shareTemplate.getArticleTitleSize());
                    log.info("文章标题位置x={}，y={},长度articleTitleSize={}",shareTemplate.getArticleTitleX(),
                            shareTemplate.getArticleTitleY(),650);
                }
                if(shareTemplate.getAvatarUrlValid() && !StringUtils.isBlank(qrCodeBody.getSharerUrl())){
                    try{
                        URL avatarUrl = new URL(qrCodeBody.getSharerUrl());
                        BufferedImage avatarPic = ImageIO.read(avatarUrl);
                        DrawPicTool.drawImgInImg(backPic,avatarPic,shareTemplate.getAvatarUrlX(),
                                shareTemplate.getAvatarUrlY(),shareTemplate.getAvatarUrlWidth(),
                                shareTemplate.getAvatarUrlWidth());
                    }catch (Exception e){
                        log.warn("获取微信头像失败！", e);
                    }
                }
                if(shareTemplate.getNickNameValid() && !StringUtils.isBlank(qrCodeBody.getSharerName())) {//new Color(144, 147, 153, 149)
                    DrawPicTool.drawNickNameTextWithLengthInImg(backPic,
                            EmojiUtils.filterEmoji(qrCodeBody.getSharerName()), shareTemplate.getNickNameX(),
                            shareTemplate.getNickNameY(), 250,shareTemplate.getNickNameSize(),
                            shareTemplate.getNickNameLength(),new Color(0, 0, 0, 238));
                }
                if(shareTemplate.getForeground1Valid()){
                    URL foreground1Url = new URL(host  + relative + shareTemplate.getForeground1());
                    BufferedImage foreground1Pic = ImageIO.read(foreground1Url);
                    DrawPicTool.drawImgInImg(backPic,foreground1Pic,shareTemplate.getForeground1X(),
                            shareTemplate.getForeground1Y(),shareTemplate.getForeground1Width(),
                            shareTemplate.getForeground1High());
                }
                if(shareTemplate.getForeground2Valid()){
                    URL foreground2Url = new URL(host  + relative + shareTemplate.getForeground2());
                    BufferedImage foreground2Pic = ImageIO.read(foreground2Url);
                    DrawPicTool.drawImgInImg(backPic,foreground2Pic,shareTemplate.getForeground2X(),
                            shareTemplate.getForeground2Y(),shareTemplate.getForeground2Width(),
                            shareTemplate.getForeground2High());
                }
                DrawPicTool.drawImgInImg(backPic,qrCodePic,shareTemplate.getAppletCodeX(),
                        shareTemplate.getAppletCodeY(),shareTemplate.getAppletCodeWidth(),
                        shareTemplate.getAppletCodeWidth());
                BufferedImage result = new BufferedImage(backPic.getWidth(), backPic.getHeight(),
                        BufferedImage.TYPE_3BYTE_BGR);
                result.getGraphics().drawImage(backPic, 0, 0, null);
                ByteArrayOutputStream bs = new ByteArrayOutputStream();
                ImageIO.write(result, "jpg", bs);
                byte[] bytes = bs.toByteArray();
                qrCodeBody.setBytes(bytes);
                ByteArrayInputStream inputStream = new ByteArrayInputStream(bytes);
                if(null == qrCodeBody.getFile()){
                    qrCodeBody.setFile(Files.createTempFile("zhhqrcode", "." + "jpg").toFile());
                }
                FileOutputStream fs = new FileOutputStream(qrCodeBody.getFile());
                fs.write(bytes);
                qrCodeBody.setInputStream(inputStream);
                inputStream.close();
                fs.close();
            } catch (Exception e) {
                log.error(this.getClass().getName(), e);
                throw new BizException(WechatCoreError.READ_FILE_FAIL);
            }
        }else {
            log.info("------分享模板为空-----");
            try {
                red = ImageIO.read(redResource.getInputStream());
                log.info(host + relative + qrCodeBody.getRealmPicUrl());
                if(StringUtils.isNotBlank(qrCodeBody.getRealmPicUrl()) && qrCodeBody.getRealmPicUrl().startsWith("http")){
                    picUrl = new URL(qrCodeBody.getRealmPicUrl());
                }else {
                    picUrl = new URL(host + relative + qrCodeBody.getRealmPicUrl());
                }
                BufferedImage realmPic = ImageIO.read(picUrl);
                BufferedImage qrCodePic = ImageIO.read(qrCodeBody.getFile());
                BufferedImage backPic = new BufferedImage(red.getWidth(), red.getHeight(),
                        BufferedImage.TYPE_4BYTE_ABGR_PRE);
                DrawPicTool.drawImgInImg(backPic, red, 0, 0, red.getWidth(), red.getHeight());
                DrawPicTool.drawImgInImg(backPic, realmPic, 0, 0, 750, 605);
                DrawPicTool.drawImgInImg(backPic, qrCodePic, 470, 740, 260, 260);
                DrawPicTool.drawTextInImg(backPic, qrCodeBody.getRealmTitle(), 43, 700, 650);
                if(!org.apache.commons.lang3.StringUtils.isBlank(qrCodeBody.getSharerName())) {
                    DrawPicTool.drawTextInImg(backPic, qrCodeBody.getSharerName(), 123, 956, 250,28,
                            new Color(144, 147, 153, 149));
                }
                if(!org.apache.commons.lang3.StringUtils.isBlank(qrCodeBody.getSharerUrl())){
                    try{
                        URL avUrl = new URL(qrCodeBody.getSharerUrl());
                        BufferedImage avPic = ImageIO.read(avUrl);
                        DrawPicTool.drawImgInImg(backPic, avPic, 48, 918, 50, 50);
                    }catch (Exception e){
                        log.warn("获取微信头像失败！", e);
                    }
                }
                BufferedImage result = new BufferedImage(backPic.getWidth(), backPic.getHeight(),
                        BufferedImage.TYPE_3BYTE_BGR);
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
        }
        return qrCodeBody;
    }
}
