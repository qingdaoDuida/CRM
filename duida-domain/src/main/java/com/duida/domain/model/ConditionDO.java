package com.duida.domain.model;

import com.alibaba.cola.domain.Entity;
import com.duida.domain.util.ConditionUtil;
import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * @author haofuwei
 * Created on 2023-01-01 20:05:45
 */
@Data
@Builder
@Slf4j
@Entity
public class ConditionDO {

    /**
     * 操作符
     */
    private String operator;
    /**
     * 操作数
     */
    private List<Object> operandList;

    /**
     * 转换为用于规则引擎执行的表达式
     * @return
     */
    public String toConditionForExecuted() {
        return ConditionUtil.parase(this);
    }
}
