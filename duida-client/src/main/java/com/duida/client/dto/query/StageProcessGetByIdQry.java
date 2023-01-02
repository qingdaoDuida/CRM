package com.duida.client.dto.query;

import com.duida.client.dto.command.CommonCommand;
import lombok.Data;

/**
 * @author haofuwei
 * Created on 2023-01-02 20:57:00
 */
@Data
public class StageProcessGetByIdQry extends CommonCommand {

    private Long processInstanceId;
}
