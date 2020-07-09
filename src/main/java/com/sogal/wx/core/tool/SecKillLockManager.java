package com.sogal.wx.core.tool;

import com.sogal.common.util.AbstractJedis;
import com.sogal.wx.core.dao.domain.base.GlobalConstantValue;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by xiaoxuwang on 2019/2/27.
 */
@Slf4j
public class SecKillLockManager {

    private AbstractJedis jedis;

    public SecKillLockManager(AbstractJedis jedis){
        this.jedis = jedis;
    }

    public void lock(String key){
        lock(key, GlobalConstantValue.TIMEOUT);
    }

    public void lock(String key, long timeout){
        long now = Long.parseLong(jedis.getTime().get(0));
        String nowAddTimeout = String.valueOf(now + timeout);
        while(jedis.setnx(key, nowAddTimeout)==0){
            if(now>Long.parseLong(jedis.get(key))&&now>jedis.getset(key, nowAddTimeout)){
                break;
            }else{
                try {
                    Thread.sleep(300);
                }catch (InterruptedException e){
                    log.warn("当前线程暂停出现异常", e);
                }
            }
        }
    }

    public void unlock(String key){
        jedis.del(key);
    }


}
