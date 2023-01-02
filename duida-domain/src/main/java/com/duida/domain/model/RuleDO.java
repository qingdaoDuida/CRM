package com.duida.domain.model;

import com.alibaba.cola.domain.Entity;
import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @author haofuwei
 * Created on 2023-01-01 21:09:44
 */
@Data
@Builder
@Slf4j
@Entity
public class RuleDO {

    private Long id;

    /**
     * 规则名称
     */
    private String name;
    /**
     * 条件
     */
    private ConditionDO conditionDO;

    /**
     *  用于规则引擎执行的表达式
     */
    private String conditionForExecutable;

}
