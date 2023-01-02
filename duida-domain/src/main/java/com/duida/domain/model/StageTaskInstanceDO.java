package com.duida.domain.model;

import com.alibaba.cola.domain.Entity;
import com.alibaba.cola.exception.ExceptionFactory;
import com.alibaba.fastjson.JSON;
import com.duida.domain.model.valueobject.CompleteStatus;
import com.duida.domain.util.QlExpressUtil;
import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

import java.util.Map;
import java.util.Objects;

/**
 * @author haofuwei
 * Created on 2023-01-02 18:41:54
 */
@Data
@Builder
@Slf4j
@Entity
public class StageTaskInstanceDO {

    private Long id;

    /**
     * 阶段任务定义
     */
    private StageTaskDefinitionDO stageTaskDefinitionDO;

    /**
     * 任务完成状态
     */
    private CompleteStatus completeStatus;

    /**
     * 检查完成情况
     * @param data
     * @return
     */
    public Boolean checkCompletion(Map<String, Object> data) {
        if (Objects.isNull(completeStatus)) {
            log.error("stageTaskInstanceId={}", this.id);
            throw ExceptionFactory.sysException("任务实例的完成状态异常 为空");
        }
        // 先判断任务状态，已完成的话直接返回
        if (CompleteStatus.COMPLETED.getCode().equals(completeStatus.getCode())) {
            return true;
        }
        // 未完成情况
        if (Objects.isNull(stageTaskDefinitionDO)) {
            log.error("stageTaskInstanceId={}", this.id);
            throw ExceptionFactory.sysException("任务定义不存在");
        }
        RuleDO completeCondition = stageTaskDefinitionDO.getCompleteCondition();
        if (Objects.isNull(completeCondition)) {
            log.warn("该任务定义中没有配置完成条件，没有配置完成条件的话，默认任务直接完成 stageTaskInstanceId={}, RuleDO={}",
                    this.id, JSON.toJSONString(this.stageTaskDefinitionDO));
            return true;
        }
        String conditionForExecutable = completeCondition.getConditionForExecutable();
        if (StringUtils.isEmpty(conditionForExecutable)) {
            log.warn("该任务定义中没有配置完成条件，没有配置完成条件的话，默认任务直接完成 stageTaskInstanceId={}, RuleDO={}",
                    this.id, JSON.toJSONString(this.stageTaskDefinitionDO));
            return true;
        }
        return (Boolean) QlExpressUtil.executeExpress(conditionForExecutable, data);
    }
}
