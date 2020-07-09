package com.sogal.wx.core.tool;

import com.sogal.common.dto.JsonResult;
import com.sogal.common.error.BaseErrorCode;
import com.sogal.common.util.JsonUtil;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by xiaoxuwang on 2019/2/22.
 */
public class DecorateResponseTool {

    public static void decorateResponse(HttpServletResponse httpServletResponse, BaseErrorCode baseErrorCode)
            throws IOException {
        httpServletResponse.setContentType("application/json;charset=utf-8");
        PrintWriter out = httpServletResponse.getWriter();
        out.append(JsonUtil.beanToJson(JsonResult.fail(baseErrorCode.getCode(), baseErrorCode.getMessage())));
    }

}
