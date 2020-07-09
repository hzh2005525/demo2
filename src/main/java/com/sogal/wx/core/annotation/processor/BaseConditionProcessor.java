package com.sogal.wx.core.annotation.processor;

import com.sogal.wx.core.annotation.BaseConditionBuilder;
import com.sogal.wx.core.dao.domain.base.BaseCondition;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by xiaoxuwang on 2019/3/4.
 */
@Aspect
@Component
@Slf4j
public class BaseConditionProcessor {

    @Before("execution(* com.sogal.wx.*.service.impl.*.*(com.sogal.wx.core.dao.domain.base.BaseCondition+))&&" +
            "@annotation(com.sogal.wx.core.annotation.BaseConditionBuilder)&&" +
            "@annotation(baseConditionBuilder)&&" +
            "args(condition)")
    public void pointHander(BaseConditionBuilder baseConditionBuilder, BaseCondition condition){
        String[] columns = baseConditionBuilder.columns();
        String column = StringUtils.join(columns, ",");
        condition.setColumns(column);
        if(baseConditionBuilder.needPage()) {
            int pageSize = condition.getPageSize();
            int pageStart = condition.getPageStart();
            pageStart = pageStart - 1 < 0 ? 1 : pageStart;
            pageSize = pageSize < 0 ? 0 : pageSize;
            condition.setPageSize(pageSize);
            condition.setPageStart((pageStart - 1) * pageSize);
            condition.setNeedPage("need");
        }
    }

}
