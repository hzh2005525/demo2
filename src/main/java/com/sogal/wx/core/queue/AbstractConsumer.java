package com.sogal.wx.core.queue;

import com.sogal.common.exception.BizException;

/**
 * Created by xiaoxuwang on 2019/2/25.
 */
public interface AbstractConsumer {

    String consumer()throws BizException;

    String consumer(String redismqKey)throws BizException;

}
