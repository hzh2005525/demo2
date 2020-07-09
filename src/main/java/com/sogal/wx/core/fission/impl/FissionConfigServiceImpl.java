package com.sogal.wx.core.fission.impl;

import com.sogal.wx.core.dao.domain.base.FissionMeThod;
import com.sogal.wx.core.fission.FissionConfigService;
import org.springframework.stereotype.Service;

@Service
public class FissionConfigServiceImpl implements FissionConfigService {
    @Override
    public String getCurrentFissionMehod() {
        return FissionMeThod.LAST.name();
    }
}
