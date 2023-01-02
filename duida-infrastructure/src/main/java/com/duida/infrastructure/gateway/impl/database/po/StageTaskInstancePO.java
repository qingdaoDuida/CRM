package com.duida.infrastructure.gateway.impl.database.po;

import lombok.Data;

/**
 * @author haofuwei
 * Created on 2023-01-02 18:40:17
 */
@Data
public class StageTaskInstancePO {

    private Long id;

    /**
     * 任务定义ID
     */
    private Long stageTaskDefId;
    /**
     * 任务完成情况
     */
    private byte completeStatus;
}
