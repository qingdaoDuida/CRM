package com.duida.client.dto.command;

import com.duida.client.dto.command.CommonCommand;
import lombok.Builder;
import lombok.Data;


/**
 * @author haofuwei
 * Created on 2023-01-02 20:43:45
 */
@Data
@Builder
public class StageProcessStartCmd extends CommonCommand {

    private Long stageProcessDefId;
}
