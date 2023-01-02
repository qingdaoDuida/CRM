package com.duida.infrastructure.gateway.impl.database.po;

import lombok.Data;

/**
 * @author haofuwei
 * Created on 2023-01-02 17:33:25
 */
@Data
public class StageProcessInstancePO {

    /**
     * 主键ID
     */
    private Long id;

    /**
     * 流程定义ID
     */
    private Long stageProcessDefId;

    /**
     * 流程实例状态
     */
    private byte status;
}
