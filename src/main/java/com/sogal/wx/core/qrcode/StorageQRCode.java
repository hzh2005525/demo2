package com.sogal.wx.core.qrcode;

import com.sogal.common.builder.HttpClientBuilder;
import com.sogal.common.builder.HttpRequestRetryBuilder;
import com.sogal.common.exception.BizException;
import com.sogal.common.util.HttpRequestUtil;
import com.sogal.wx.core.error.WechatCoreError;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.nio.charset.Charset;


/**
 * Created by xiaoxuwang on 2019/2/27.
 */
public class StorageQRCode implements QRCodeDrawingBoard{

    @Value("${image.server.host}")
    private String host;

    @Value("${image.server.upload}")
    private String upload;

    @Autowired
    private HttpClientBuilder httpClientBuilder;

    @Override
    public QRCodeBody drawQRCode(QRCodeBody qrCodeBody) throws BizException {
        HttpRequestUtil client = new HttpRequestUtil.Builder(HttpRequestRetryBuilder.getInstance(),
                httpClientBuilder).build();
        HttpPost httppost = new HttpPost(host + upload);
        MultipartEntityBuilder entityBuilder = MultipartEntityBuilder.create();
        entityBuilder.setCharset(Charset.forName("UTF-8"));
        entityBuilder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
        ContentType contentType = ContentType.create("multipart/form-data", Charset.forName("UTF-8"));
        HttpEntity reqEntity = entityBuilder.addPart("file", new FileBody(qrCodeBody.getFile(), contentType)).build();
        httppost.setEntity(reqEntity);
        String resXml = client.send(httppost);
        try {
            JSONObject jo = new JSONObject(resXml);
            if( "000".equals(jo.getString("code"))){
                JSONObject map = jo.getJSONObject("data");
                qrCodeBody.setMd5(map.getString("md5"));
                qrCodeBody.setPath(map.getString("relativePath"));
                qrCodeBody.setGhostRelativePath(map.getString("ghostRelativePath"));
                qrCodeBody.setFileExt(map.getString("fileExt"));
                qrCodeBody.setRealFileName(map.getString("realFileName"));
            }else{
                throw new BizException(WechatCoreError.QRCODE_BUILD_FAIL);
            }
        }catch (Exception e){
            throw new BizException(WechatCoreError.QRCODE_BUILD_FAIL);
        }
        return qrCodeBody;
    }
}
