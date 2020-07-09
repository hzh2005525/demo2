package com.sogal.wx.core.tool;

import com.sogal.common.util.AbstractSerialNumberFactory;
import com.sogal.common.util.IOrdinalValuesFactory;

/**
 * Created by xiaoxuwang on 2019/4/18.
 */

public enum SerialNumberFactory implements AbstractSerialNumberFactory {

    TOPIC_NUMBER("SN"){
        @Override
        public String build(IOrdinalValuesFactory factory) {
            String tail = String.format("%08d", factory.getOrdinalValue("WECHAT:SIGN", Integer.MAX_VALUE));
            return this.prefix + tail;
        }
    };

    protected final String prefix;

    SerialNumberFactory(String prefix) {
        this.prefix = prefix;
    }
}
