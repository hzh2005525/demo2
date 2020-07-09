package com.sogal.wx.core.dao.domain.sign;

import com.sogal.wx.core.dao.domain.base.BaseEntity;
import com.sogal.wx.core.dao.domain.base.WechatCategory;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

/**
 * Created by xiaoxuwang on 2019/2/26.
 */
@Getter
@Setter
public class SysSignType extends BaseEntity{

    private String type;
    private String value;
    private WechatCategory category;
    //标签组封面url
    private String stCoverUrl;
    //是否展示
    private Boolean showValid;

    private int sort;

    public SysSignType(){}

    public SysSignType(String value, WechatCategory category, String creator, String updater){
        super();
        this.value = value;
        this.category = category;
        super.setCreator(creator);
        super.setUpdater(updater);
    }

    public SysSignType(WechatCategory category, Boolean showValid,String updater,String id) {
        this.category = category;
        this.showValid = showValid;
        super.setId(id);
        super.setUpdater(updater);
    }

    public SysSignType(Boolean showValid,  String updater, String id) {
        this.showValid = showValid;
        super.setId(id);
        super.setUpdater(updater);
    }
}
