package com.sogal.wx.core.dao.domain.dynamic;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.sogal.common.util.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * 操作记录（如厨房护理动态）
 */
@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MpDynamic implements Serializable{

    /**
     * uuid
     */
    private String id;

    /**
     * 用户id
     */
    private String userId;

    //操作事项，如：用户、服务预约记录等
    private MpDynamicRealm realm;

    /**
     * 操作事项id
     */
    private String realmId;

    //跟进动作
    @NotNull
    private MpDynamicAction action;

    //跟进内容
    private String content;

    private String operatorRole;

    //跟进人
    private String operatorId;

    //跟进时间
    @ApiModelProperty(hidden = true)
    private Date timeCreated;

    //跟进人姓名
    private String operatorName;


    public MpDynamic(MpDynamicRealm realm, String realmId, MpDynamicAction action,
                     String content, String operatorRole, String operatorId, String operatorName) {
        this.id = StringUtil.uuid();
        this.realm = realm;
        this.realmId = realmId;
        this.action = action;
        this.content = content;
        this.operatorRole = operatorRole;
        this.operatorId = operatorId;
        this.operatorName = operatorName;
    }

}

