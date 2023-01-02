package com.duida.domain.util;

import com.alibaba.cola.exception.ExceptionFactory;
import com.ql.util.express.DefaultContext;
import com.ql.util.express.ExpressRunner;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

/**
 * @author haofuwei
 * Created on 2023-01-02 19:24:09
 */
@Slf4j
public class QlExpressUtil {

    public static Object executeExpress(String expression, Map<String, Object> data) {
        ExpressRunner runner = new ExpressRunner();
        DefaultContext<String, Object> context = new DefaultContext<>();
        for (String key : data.keySet()) {
            context.put(key, data.get(key));
        }
        try {
            return runner.execute(expression, context, null, true, false);
        } catch (Exception e) {
            log.error("QLExpress run exception expression={}, data={} context={}",
                    expression, data, context);
            throw ExceptionFactory.sysException("QLExpress 执行发生异常");
        }
    }
}
