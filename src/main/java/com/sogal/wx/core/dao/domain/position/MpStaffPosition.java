package com.sogal.wx.core.dao.domain.position;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.sogal.common.util.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MpStaffPosition {

    private String id;

    //员工id
    private String staffId;

    //职位id
    private String positionId;


    //任职开始时间
    @ApiModelProperty(hidden = true)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date effectiveTime;

    //状态 1:有效 0:无效
    @ApiModelProperty(hidden = true)
    private Boolean valid;

    //任职结束时间
    @ApiModelProperty(hidden = true)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date invalidTime;


    public MpStaffPosition(String staffId, String positionId) {
        this.id = StringUtil.uuid();
        this.staffId = staffId;
        this.positionId = positionId;
        this.valid = true;
    }

}
