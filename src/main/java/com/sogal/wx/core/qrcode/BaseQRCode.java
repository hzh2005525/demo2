package com.sogal.wx.core.qrcode;

import cn.binarywang.wx.miniapp.api.WxMaService;
import cn.binarywang.wx.miniapp.bean.WxMaCodeLineColor;
import com.sogal.common.error.GlobalErrorCode;
import com.sogal.common.exception.BizException;
import com.sogal.wx.core.error.WechatCoreError;
import lombok.extern.slf4j.Slf4j;
import me.chanjar.weixin.common.error.WxErrorException;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.Resource;
import java.io.*;

/**
 * Created by xiaoxuwang on 2019/2/27.
 */
@Slf4j
public class BaseQRCode implements QRCodeDrawingBoard {

    @Resource
    private WxMaService wxCmsMaService;

    @Value("${image.server.share-path}")
    private String sharePath;

    /**
     * @shareUrl
     * @type
     * @realmUniqNo
     */
    @Override
    public QRCodeBody drawQRCode(QRCodeBody qrCodeBody)throws BizException {
        qrCodeBody.setShareUrl(sharePath);
        if (null == qrCodeBody) {
            throw new BizException(GlobalErrorCode.PARAM_ERROR);
        }
        if (StringUtils.isBlank(qrCodeBody.getShareUrl())) {
            throw new BizException(WechatCoreError.SHARE_URL_NULL);
        }
        String scene = null;
        if(StringUtils.isBlank(qrCodeBody.getScene())){
            scene = StringUtils.join(qrCodeBody.getType(), ",", qrCodeBody.getRealmUniqNo());
        }else {
            scene = qrCodeBody.getScene();
        }
//        String scene = StringUtils.join(qrCodeBody.getType(), ",", qrCodeBody.getRealmUniqNo());
        if (scene.length() > 32) {
            throw new BizException(WechatCoreError.SCENE_TOO_LONG);
        }
        log.info("scene的长度={},内容={}" , scene.length(),scene);
        try {
//            File file = wxMaService.getQrcodeService().createWxaCodeUnlimit(scene, qrCodeBody.getShareUrl());
            File file = wxCmsMaService.getQrcodeService().createWxaCodeUnlimit(scene, qrCodeBody.getShareUrl(),430,true,(WxMaCodeLineColor)null,true);
            qrCodeBody.setFile(file);
            InputStream  inputStream = new FileInputStream(file);
            qrCodeBody.setInputStream(inputStream);
            ByteArrayOutputStream output = new ByteArrayOutputStream();
            byte[] buffer = new byte[4096];
            int n = 0;
            while (-1 != (n = inputStream.read(buffer))) {
                output.write(buffer, 0, n);
            }
            byte[] bytes = output.toByteArray();
            qrCodeBody.setBytes(bytes);
        } catch (WxErrorException e) {
            throw new BizException(WechatCoreError.WECHAT_QRCODE_ERROR);
        } catch (FileNotFoundException e) {
            throw new BizException(WechatCoreError.CREATE_FILE_FAIL);
        } catch (IOException e) {
            log.error(this.getClass().getName(), e);
            throw new BizException(WechatCoreError.READ_FILE_FAIL);
        }
        return qrCodeBody;
    }

}
