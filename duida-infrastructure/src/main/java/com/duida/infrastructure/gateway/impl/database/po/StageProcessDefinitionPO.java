package com.duida.infrastructure.gateway.impl.database.po;

import lombok.Data;

/**
 * @author haofuwei
 * Created on 2023-01-02 13:57:19
 */
@Data
public class StageProcessDefinitionPO {

    /**
     * 主键ID
     */
    private Long id;
    /**
     * 流程名称
     */
    private String name;
    /**
     * 流程版本
     */
    private Long version;
    /**
     * 阶段数组
     */
    private String stageIdArr;

    /**
     * 可回退for阶段
     */
    private Byte fallbackForStage;

    /**
     * 流程状态
     */
    private Byte status;

    /**
     * 展示信息for阶段
     */
    private String showInfoForStage;
}
