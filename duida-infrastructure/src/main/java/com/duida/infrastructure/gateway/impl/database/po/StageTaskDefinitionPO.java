package com.duida.infrastructure.gateway.impl.database.po;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 任务定义
 * @author haofuwei
 * Created on 2023-01-02 13:22:13
 */
@Data
public class StageTaskDefinitionPO {

    /**
     * 主键ID
     */
    private Long id;
    /**
     * 任务名称
     */
    private String name;
    /**
     * 任务占比
     */
    private BigDecimal ratio;
    /**
     * 必填
     */
    private byte required;
    /**
     * 执行人
     */
    private String executor;
    /**
     * 完成条件
     */
    private String completeCondition;
}
