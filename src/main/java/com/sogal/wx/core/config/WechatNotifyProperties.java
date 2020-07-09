package com.sogal.wx.core.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by xiaoxuwang on 2019/4/22.
 */
@Data
@ConfigurationProperties(prefix = "notify")
public class WechatNotifyProperties {

    private Wechat wechat;


    public static class Wechat{
        private boolean enable;
        private List<Map<String, String>> template = new ArrayList<>();
        public boolean isEnable() {
            return enable;
        }

        public void setEnable(boolean enable) {
            this.enable = enable;
        }

        public List<Map<String, String>> getTemplate() {
            return template;
        }

        public void setTemplate(List<Map<String, String>> template) {
            this.template = template;
        }
    }

}
