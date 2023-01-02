package com.duida.domain.model;

import com.alibaba.cola.domain.Entity;
import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author haofuwei
 * Created on 2023-01-02 13:31:04
 */
@Entity
@Data
@Builder
@Slf4j
public class StageTaskDefinitionDO {

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
    private BigDecimal radio;
    /**
     * 任务完成条件
     */
    private RuleDO completeCondition;
    /**
     * 执行人
     */
    private List<String> executor;
    /**
     * 必填
     */
    private Boolean required;
}
