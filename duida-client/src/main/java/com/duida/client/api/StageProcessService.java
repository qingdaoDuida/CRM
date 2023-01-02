package com.duida.client.api;

import com.duida.client.dto.StageProcessInstanceDTO;
import com.duida.client.dto.command.StageProcessStartCmd;
import com.duida.client.dto.query.StageProcessGetByIdQry;

/**
 * @author haofuwei
 * Created on 2023-01-02 20:31:30
 */
public interface StageProcessService {

    /**
     * 启动流程
     * @param stageProcessStartCmd
     * @return
     */
    Long start(StageProcessStartCmd stageProcessStartCmd);

    /**
     * 通过流程实例ID查询流程实例信息
     * @param stageProcessGetByIdQry
     * @return
     */
    StageProcessInstanceDTO queryById(StageProcessGetByIdQry stageProcessGetByIdQry);
}
