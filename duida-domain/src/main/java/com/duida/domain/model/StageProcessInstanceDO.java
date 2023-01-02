package com.duida.domain.model;

import com.alibaba.cola.domain.Entity;
import com.duida.domain.model.valueobject.StageProcessInstanceStatus;
import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * 流程实例
 * @author haofuwei
 * Created on 2023-01-02 18:04:51
 */
@Entity
@Data
@Builder
@Slf4j
public class StageProcessInstanceDO {

    /**
     * 主键ID
     */
    private Long id;
    /**
     * 流程定义
     */
    private StageProcessDefinitionDO stageProcessDefinitionDO;
    /**
     * 流程实例状态
     */
    private StageProcessInstanceStatus status;

    /**
     * 阶段实例列表
     */
    private List<StageInstanceDO> stageInstanceDOList;
}
