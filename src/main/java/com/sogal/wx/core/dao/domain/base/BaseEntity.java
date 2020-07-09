package com.sogal.wx.core.dao.domain.base;

import com.sogal.common.util.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * Created by xiaoxuwang on 2019/2/20.
 */
@Getter
@Setter
public abstract class BaseEntity {

    @ApiModelProperty(value = "主键id", hidden = true)
    private String id;
    @ApiModelProperty(value = "创建时间", hidden = true)
    private LocalDateTime timeCreated;
    @ApiModelProperty(value = "创建人", hidden = true)
    private String creator;
    @ApiModelProperty(value = "最后更新人", hidden = true)
    private String updater;
    @ApiModelProperty(value = "最后更新时间", hidden = true)
    private LocalDateTime timeUpdated;

    public BaseEntity(){
        this.id = StringUtil.uuid();
    }

}
