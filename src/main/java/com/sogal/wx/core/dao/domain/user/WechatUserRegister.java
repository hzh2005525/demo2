package com.sogal.wx.core.dao.domain.user;

import com.sogal.wx.core.dao.domain.base.BaseEntity;
import com.sogal.wx.core.dao.domain.base.WechatCategory;
import com.sogal.wx.core.dao.domain.enroll.EnrollStage;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Getter
@Setter
public class WechatUserRegister extends BaseEntity {

    @ApiModelProperty("用户编号")
    private String userNo;
    @ApiModelProperty("用户ID")
    private String userId;
    @ApiModelProperty("报名填写手机号")
    private String mobile;
    @ApiModelProperty("报名填写名字")
    private String name;
    @ApiModelProperty("用户填写省")
    private String userProvince;
    @ApiModelProperty("用户填写市")
    private String userCity;
    @ApiModelProperty("用户填写区")
    private String userArea;
    @ApiModelProperty("用户填写街道、园区、写字楼")
    private String userAddr;
    @ApiModelProperty(hidden = true)
    private String createTime;
    private WechatCategory category;
    @ApiModelProperty("用户报名活动文章id或其他关联id")
    private String entityId;
    private String sharerNo;

    private ConvertStatus status;

    /**
     * 是否有效
     */
    private Boolean valid;

    /**
     * 无效原因
     */
    private String invalidReason;

    /**
     * 无效时间
     */
    private Date invalidTime;

    /**
     * 报名用户所处阶段
     */
    private EnrollStage stage;

    /**
     * 报名用户到店日期
     */
    private Date storeDate;


    public void setTimeCreated(LocalDateTime timeCreated){
        super.setTimeCreated(timeCreated);
        if(timeCreated!=null) {
            createTime = timeCreated.format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
    }
}
