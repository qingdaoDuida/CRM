package com.duida.infrastructure.gateway.impl.database.po;

import lombok.Data;

/**
 * @author haofuwei
 * Created on 2023-01-02 18:11:09
 */
@Data
public class StageInstancePO {

    /**
     * 主键ID
     */
    private Long id;
    /**
     * 阶段定义ID
     */
    private Long stageDefId;
    /**
     * 阶段实例状态
     */
    private byte status;

    /**
     * 是否已跳过
     */
    private byte skipped;
}
