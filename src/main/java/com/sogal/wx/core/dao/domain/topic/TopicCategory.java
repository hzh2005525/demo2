package com.sogal.wx.core.dao.domain.topic;

import com.sogal.wx.core.dao.domain.base.WechatCategory;
import com.sogal.wx.core.dao.domain.design.WechatKind;
import lombok.Getter;

import java.util.*;

@Getter
public enum TopicCategory {
    REFORM(WechatCategory.REFORM, new ArrayList<>(Arrays.asList(WechatKind.DESIGN,WechatKind.CASE,
            WechatKind.PACKAGE,WechatKind.ACTIVITY,WechatKind.NEWS))),
    DESIGN(WechatCategory.DESIGN, new ArrayList<>(Arrays.asList(WechatKind.DESIGN,WechatKind.PACKAGE,
            WechatKind.ACTIVITY,WechatKind.NEWS,WechatKind.RULE)));

    private ArrayList<WechatKind> kinds;
    private WechatCategory category;
    private String name;

    TopicCategory(WechatCategory category, ArrayList<WechatKind> kinds) {
        this.category = category;
        this.kinds = kinds;
        this.name = category.getName();
    }
    public static List<Map<String,String>> getKindKeyValueByCategory(TopicCategory category){
        ArrayList<WechatKind> kinds = category.getKinds();
        List<Map<String,String>> list = new ArrayList<>();
        if(null == kinds){
            return list;
        }
        for(WechatKind kind : kinds){
            Map<String,String> map = new HashMap<>();
            map.put("value", kind.name());
            map.put("key",kind.getName());
            list.add(map);
        }
        return list;
    }
}
