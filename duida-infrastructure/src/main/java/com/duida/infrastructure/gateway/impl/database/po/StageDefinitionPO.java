package com.duida.infrastructure.gateway.impl.database.po;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 阶段定义
 * @author haofuwei
 * Created on 2023-01-01 17:51:30
 */
@Data
public class StageDefinitionPO {

    /**
     * 主键ID
     */
    private Long id;

    /**
     * 阶段名
     */
    private String name;

    /**
     * 阶段类型
     */
    private Byte type;

    /**
     * 启用
     */
    private Byte enable;
    /**
     * 跳过此阶段
     */
    private Byte skip;

    /**
     * 赢率
     */
    private BigDecimal winRate;

    /**
     * 推进人
     */
    private String pushDirector;
}
