package com.duida.domain.model;

import com.alibaba.cola.domain.Entity;
import com.duida.domain.model.valueobject.Enable;
import com.duida.domain.model.valueobject.StageType;
import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.util.List;

/**
 * 阶段定义
 * @author haofuwei
 * Created on 2023-01-01 18:13:35
 */
@Data
@Builder
@Slf4j
@Entity
public class StageDefinitionDO {


    private Long id;
    /**
     * 阶段名称
     */
    private String name;
    /**
     * 阶段类型
     */
    private StageType stageType;

    /**
     * 启用
     */
    private Enable enable;

    /**
     * 跳过
     */
    private Boolean skip;

    /**
     * 赢率
     */
    private BigDecimal winRate;

    /**
     * 阶段推进人
     */
    private List<String> pushDirector;

    /**
     * 阶段进入条件
     */
    private RuleDO enterRule;

    /**
     * 任务集
     */
    private List<StageTaskDefinitionDO> taskDefinitionDOList;
}
