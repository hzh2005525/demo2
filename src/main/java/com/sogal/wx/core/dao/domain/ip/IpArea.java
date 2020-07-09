package com.sogal.wx.core.dao.domain.ip;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class IpArea {

    private String intIp;

    private String ip;

    private String city;

    public IpArea(String intIp, String ip, String city) {
        this.intIp = intIp;
        this.ip = ip;
        this.city = city;
    }
}
