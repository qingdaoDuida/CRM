package com.duida.domain.model;

import com.alibaba.cola.domain.Entity;
import com.duida.domain.model.valueobject.StageProcessDefStatus;
import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * @author haofuwei
 * Created on 2023-01-02 17:19:13
 */
@Data
@Builder
@Slf4j
@Entity
public class StageProcessDefinitionDO {

    /**
     * 主键ID
     */
    private Long id;
    /**
     * 流程名称
     */
    private String name;
    /**
     * 版本
     */
    private Long version;
    /**
     * 流程定义状态
     */
    private StageProcessDefStatus status;
    /**
     * 阶段定义列表
     */
    private List<StageDefinitionDO> stageDefinitionDOList;


}
