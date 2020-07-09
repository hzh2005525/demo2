package com.sogal.wx.core.dao.domain.design;

import com.sogal.wx.core.dao.domain.base.BaseCondition;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by xiaoxuwang on 2019/3/12.
 */
@Getter
@Setter
public class SignReommendCondition extends BaseCondition{
    @ApiModelProperty(hidden=true)
    private List<String> signTypes;
    @ApiModelProperty("设计ID")
    private String designId;
    @ApiModelProperty(hidden=true)
    private List<String> signIds;

    public SignReommendCondition(){}

    public SignReommendCondition(String designId){
        this.designId = designId;
    }

}
