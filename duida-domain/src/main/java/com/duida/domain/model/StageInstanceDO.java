package com.duida.domain.model;

import com.alibaba.cola.domain.Entity;
import com.alibaba.cola.exception.ExceptionFactory;
import com.alibaba.fastjson.JSON;
import com.duida.domain.model.valueobject.StageInstanceStatus;
import com.duida.domain.util.QlExpressUtil;
import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @author haofuwei
 * Created on 2023-01-02 18:33:53
 */
@Data
@Builder
@Slf4j
@Entity
public class StageInstanceDO {

    private Long id;

    /**
     * 阶段定义
     */
    private StageDefinitionDO stageDefinitionDO;

    /**
     * 阶段实例状态
     */
    private StageInstanceStatus status;

    /**
     * 已跳过
     */
    private Boolean skipped;

    /**
     * 任务实例列表
     */
    private List<StageTaskInstanceDO> stageTaskInstanceDOList;


    /**
     * 检查能否进入该阶段
     * @param data
     * @return
     */
    public Boolean checkCanEnter(Map<String, Object> data) {
        if (Objects.isNull(this.stageDefinitionDO)) {
            log.error("该阶段定义不存在 stageInstanceId={}", this.id);
            throw ExceptionFactory.sysException("该阶段定义不存在");
        }
        RuleDO enterRule = stageDefinitionDO.getEnterRule();
        if (Objects.isNull(enterRule) || StringUtils.isEmpty(enterRule.getConditionForExecutable())) {
            log.warn("该阶段没有配置进入条件 默认可以进入 stageInstanceId={}, enterRule={}", this.id, JSON.toJSONString(enterRule));
            return true;
        }
        String conditionForExecutable = enterRule.getConditionForExecutable();
        return (Boolean) QlExpressUtil.executeExpress(conditionForExecutable, data);
    }
}
