package com.sogal.wx.core.error;

import com.sogal.common.error.BaseErrorCode;
import lombok.Getter;

/**
 * Created by xiaoxuwang on 2019/2/21.
 */
@Getter
public enum  WechatCoreError implements BaseErrorCode {

    UNKNOWN_HOST("50001", "获取ip失败"),
    WITH_TOKEN("50002", "TOKEN获取失败"),
    WITHOUT_LOGIN("50003", "用户登录过期"),
    CREATE_MD5_FAIL("50004", "获取MD5失败"),
    ASPECT("50005", "切面【%s】运行异常，参数：%s"),
    GET_LOG_ERROR("50006", "获取日志失败"),
    CLOSE_FILE_ERROR("50007", "文件关闭失败"),
    SCENE_TOO_LONG("50008", "scene字段过长"),
    SHARE_URL_NULL("50009", "小程序跳转路径不能为空"),
    WECHAT_QRCODE_ERROR("50010", "微信服务端异常，超出重试次数"),
    CREATE_FILE_FAIL("50011", "文件创建失败"),
    READ_FILE_FAIL("50012", "文件读取失败"),
    QRCODE_BUILD_FAIL("50013", "二维码存储失败"),
    CRYPTO_ERROR("50014", "获取手机号失败"),
    APPLET_MARK_ERROR("50015", "获取小程序标识失败");

    private final String code;
    private final String message;

    WechatCoreError(String code, String message){
        this.code = code;
        this.message = message;
    }

}
