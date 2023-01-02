package com.duida.app.service;

import com.duida.client.api.StageProcessService;
import com.duida.client.dto.StageProcessInstanceDTO;
import com.duida.client.dto.command.StageProcessStartCmd;
import com.duida.client.dto.query.StageProcessGetByIdQry;
import org.springframework.stereotype.Service;

/**
 * @author haofuwei
 * Created on 2023-01-02 20:54:01
 */
@Service
public class StageProcessServiceImpl implements StageProcessService {

    @Override
    public Long start(StageProcessStartCmd stageProcessStartCmd) {
        return null;
    }

    @Override
    public StageProcessInstanceDTO queryById(StageProcessGetByIdQry stageProcessGetByIdQry) {
        return null;
    }
}
