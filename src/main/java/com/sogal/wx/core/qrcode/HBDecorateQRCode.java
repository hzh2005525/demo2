package com.sogal.wx.core.qrcode;

import com.sogal.common.exception.BizException;
import com.sogal.wx.core.dao.domain.huabao.CMSHuaBao;
import com.sogal.wx.core.dao.domain.share.ShareMethod;
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
import java.net.URL;
import java.nio.file.Files;

@Slf4j
public class HBDecorateQRCode implements QRCodeDrawingBoard{

    @Value("${image.server.host}")
    private String host;

    @Value("${image.server.relative}")
    private String relative;


    @Override
    public QRCodeBody drawQRCode(QRCodeBody qrCodeBody) throws BizException {
        BufferedImage red = null;
        CMSHuaBao cmsHuaBao = qrCodeBody.getCmsHuaBao();
        BufferedImage bgPic = null;
        URL bgPicUrl = null;
        if(null != cmsHuaBao){
            try {
                /*
                1.读取背景图
                 */
                bgPicUrl = new URL(host  + relative + cmsHuaBao.getBackgroundImage());
                bgPic = ImageIO.read(bgPicUrl);
                //3.码图片
                BufferedImage qrCodePic;
                if(ShareMethod.WECHAT_SERVICE_ACCOUNT.name().equals(cmsHuaBao.getShareCodeType())){
                    URL qrCodePicUrl = new URL(qrCodeBody.getQrcodeUrl());
                    qrCodePic = ImageIO.read(qrCodePicUrl);
                }else {
                    qrCodePic = ImageIO.read(qrCodeBody.getFile());
                }

                //画图
                BufferedImage backPic = new BufferedImage(cmsHuaBao.getBgImageWidth(),cmsHuaBao.getBgImageHigh(),
                        BufferedImage.TYPE_4BYTE_ABGR_PRE);
                DrawPicTool.drawImgInImg(backPic, bgPic, 0, 0,
                        cmsHuaBao.getBgImageWidth(),cmsHuaBao.getBgImageHigh());

                log.info("文章标题开始draw = {}",cmsHuaBao.getTitle());
                DrawPicTool.drawTextWithFontHeightInImg(backPic,qrCodeBody.getRealmTitle(),
                        cmsHuaBao.getTitleX(),cmsHuaBao.getTitleY(),650,
                        cmsHuaBao.getTitleSize());
                log.info("标题位置x={}，y={},长度titleSize={}",cmsHuaBao.getTitleX(),cmsHuaBao.getTitleY(),650);

                if(cmsHuaBao.getAvatarUrlValid() && !StringUtils.isBlank(qrCodeBody.getSharerUrl())){
                    if(qrCodeBody.getSharerUrl().equals("http")){
                        try{
                            URL avatarUrl = new URL(qrCodeBody.getSharerUrl());
                            BufferedImage avatarPic = ImageIO.read(avatarUrl);
                            DrawPicTool.drawImgInImg(backPic,avatarPic,cmsHuaBao.getAvatarUrlX(),
                                    cmsHuaBao.getAvatarUrlY(),cmsHuaBao.getAvatarUrlWidth(),
                                    cmsHuaBao.getAvatarUrlWidth());
                        }catch (Exception e){
                            log.warn("获取微信头像失败！", e);
                        }
                    }else {
                        ClassPathResource redResourceOfAvatar = new ClassPathResource(qrCodeBody.getSharerUrl());
                        red = ImageIO.read(redResourceOfAvatar.getInputStream());
                        DrawPicTool.drawImgInImg(backPic,red,cmsHuaBao.getAvatarUrlX(),
                                cmsHuaBao.getAvatarUrlY(),cmsHuaBao.getAvatarUrlWidth(),
                                cmsHuaBao.getAvatarUrlWidth());
                    }
                }

                if(cmsHuaBao.getNickNameValid() && !StringUtils.isBlank(qrCodeBody.getSharerNickName())) {
                    //new Color(144, 147, 153, 149)
                    DrawPicTool.drawNickNameTextWithLengthInImg(backPic,
                            EmojiUtils.filterEmoji(qrCodeBody.getSharerNickName()), cmsHuaBao.getNickNameX(),
                            cmsHuaBao.getNickNameY(), 250,cmsHuaBao.getNickNameSize(),
                            cmsHuaBao.getNickNameLength(),new Color(0, 0, 0, 238));
                }
                if(cmsHuaBao.getSharerNameValid() && !StringUtils.isBlank(qrCodeBody.getSharerName())){
                    DrawPicTool.drawNickNameTextWithLengthInImg(backPic,
                            EmojiUtils.filterEmoji(qrCodeBody.getSharerName()), cmsHuaBao.getSharerNameX(),
                            cmsHuaBao.getSharerNameY(), 250,cmsHuaBao.getSharerNameSize(),
                            cmsHuaBao.getSharerNameLength(),new Color(0, 0, 0, 238));
                }
                if(cmsHuaBao.getSharerMobileValid() && !StringUtils.isBlank(qrCodeBody.getSharerMobile())){
                    DrawPicTool.drawNickNameTextWithLengthInImg(backPic,
                            EmojiUtils.filterEmoji(qrCodeBody.getSharerMobile()), cmsHuaBao.getSharerMobileX(),
                            cmsHuaBao.getSharerMobileY(), 250,cmsHuaBao.getSharerMobileSize(),
                            cmsHuaBao.getSharerMobileLength(),new Color(0, 0, 0, 238));
                }

                if(cmsHuaBao.getForeground1Valid()){
                    URL foreground1Url = new URL(host  + relative + cmsHuaBao.getForeground1());
                    BufferedImage foreground1Pic = ImageIO.read(foreground1Url);
                    DrawPicTool.drawImgInImg(backPic,foreground1Pic,cmsHuaBao.getForeground1X(),
                            cmsHuaBao.getForeground1Y(),cmsHuaBao.getForeground1Width(),
                            cmsHuaBao.getForeground1High());
                }
                if(cmsHuaBao.getForeground2Valid()){
                    URL foreground2Url = new URL(host  + relative + cmsHuaBao.getForeground2());
                    BufferedImage foreground2Pic = ImageIO.read(foreground2Url);
                    DrawPicTool.drawImgInImg(backPic,foreground2Pic,cmsHuaBao.getForeground2X(),
                            cmsHuaBao.getForeground2Y(),cmsHuaBao.getForeground2Width(),
                            cmsHuaBao.getForeground2High());
                }

                DrawPicTool.drawImgInImg(backPic,qrCodePic,cmsHuaBao.getShareCodeX(),
                        cmsHuaBao.getShareCodeY(),cmsHuaBao.getShareCodeWidth(),
                        cmsHuaBao.getShareCodeWidth());

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

            //不做处理
        }
        return qrCodeBody;
    }
}