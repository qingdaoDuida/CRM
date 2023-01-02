package com.duida.infrastructure.gateway.impl.database.po;

import lombok.Data;

/**
 * 规则
 * @author haofuwei
 * Created on 2023-01-02 13:05:45
 */
@Data
public class RulePO {

    /**
     * 主键ID
     */
    private Long id;
    /**
     * 规则名
     */
    private String name;
    /**
     * 原条件
     */
    private String originalCondition;
    /**
     * 可被执行的条件
     */
    private String conditionForExecutable;
}
