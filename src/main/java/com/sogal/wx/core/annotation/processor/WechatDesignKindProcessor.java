package com.sogal.wx.core.annotation.processor;

import com.sogal.wx.core.dao.domain.design.DesignCreatorIdentity;
import com.sogal.wx.core.dao.domain.design.DesignShowLevel;
import com.sogal.wx.core.dao.domain.design.WechatDesign;
import com.sogal.wx.core.dao.mapper.WechatDesignMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Aspect
@Slf4j
@Order(1)
public class WechatDesignKindProcessor {

    @Autowired
    private WechatDesignMapper wechatDesignMapper;

    @Before("execution(* com.sogal.wx.core.dao.mapper.WechatDesignMapper." +
            "insertWechatDesign(com.sogal.wx.core.dao.domain.design.WechatDesign)) && args(wechatDesign)")
    public void setKindOfDesign(WechatDesign wechatDesign){
        if(null == wechatDesign.getArea()){
            wechatDesign.setArea(0);
        }
        if(null == wechatDesign.getShowLevel()){
            wechatDesign.setShowLevel(DesignShowLevel.PRIVATE);
        }
        if(null == wechatDesign.getCreatorIdentity()){
            wechatDesign.setCreatorIdentity(DesignCreatorIdentity.STAFF);
        }
//        if(null == wechatDesign.getCategory()){
//            wechatDesign.setCategory(WechatCategory.DESIGN);
//        }
        if(null == wechatDesign.getHprice()){
            wechatDesign.setHprice(BigDecimal.valueOf(0.00));
        }
        if(null == wechatDesign.getLprice()){
            wechatDesign.setLprice(BigDecimal.valueOf(0.00));
        }
        if(null == wechatDesign.getHotLevel()){
            wechatDesign.setHotLevel(0);
        }
        checkDesignParam(wechatDesign);
    }

    @Before("execution(* com.sogal.wx.core.dao.mapper.WechatDesignMapper." +
            "updateWechatDesign(com.sogal.wx.core.dao.domain.design.WechatDesign)) && args(wechatDesign)")
    public void updateDesignProcess(WechatDesign wechatDesign){
        checkDesignParam(wechatDesign);
    }

    private void checkDesignParam(WechatDesign wechatDesign) {
        String panorama = wechatDesign.getPanorama();
        if(StringUtils.isNotBlank(panorama) ){
            if(panorama.startsWith("https://www.kujiale.com")){
                panorama = StringUtils.replace(panorama,"https://www.kujiale.com",
                        "/kjl/redirect");
            }else if(panorama.startsWith("https://pano.kujiale.com")){
                panorama = StringUtils.replace(panorama,"https://pano.kujiale.com",
                        "/kjl/redirect/pano");
            }else if(panorama.startsWith("https://yun.kujiale.com")){
                panorama = StringUtils.replace(panorama,"https://yun.kujiale.com",
                        "/kjl/redirect");
            }else if(panorama.startsWith("https://vr.justeasy.cn")){
                panorama = StringUtils.replace(panorama,"https://vr.justeasy.cn",
                        "/jyw/redirect/design");
            }
            wechatDesign.setPanorama(panorama);
        }
    }
    @AfterReturning("execution(* com.sogal.wx.core.dao.mapper.WechatDesignMapper." +
            "insertWechatDesign(com.sogal.wx.core.dao.domain.design.WechatDesign))&&args(wechatDesign)")
    public void publicDesign(WechatDesign wechatDesign){
        wechatDesign.setShowLevel(DesignShowLevel.PUBLIC);
        wechatDesign.setUpdater(wechatDesign.getCreator());
        List<String> ids = new ArrayList<>();
        ids.add(wechatDesign.getId());
        wechatDesignMapper.publishDesigns(ids,wechatDesign);
    }

}
