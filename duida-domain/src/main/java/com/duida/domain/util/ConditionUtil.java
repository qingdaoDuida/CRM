package com.duida.domain.util;

import com.duida.domain.model.ConditionDO;
import com.google.common.collect.Lists;
import org.apache.commons.collections.CollectionUtils;

import java.util.List;

/**
 * @author haofuwei
 * Created on 2023-01-01 21:18:47
 */
public class ConditionUtil {

    public static String parase(Object condition) {
        if (condition instanceof ConditionDO) {
            ConditionDO conditionDO = (ConditionDO) condition;
            List<Object> operandList = conditionDO.getOperandList();
            if (CollectionUtils.isNotEmpty(operandList)) {
                List<String> operandStrList = Lists.newArrayList();
                for (Object operand : operandList) {
                    operandStrList.add(parase(operand));
                }
                return "(" + String.join(" " + conditionDO.getOperator() + " ", operandStrList) + ")";
            } else {
                return " 1=1";
            }
        } else {
            return String.valueOf(condition);
        }
    }

    public static void main(String[] args) {
        ConditionDO conditionDO2 = ConditionDO.builder()
                .operator(">=")
                .operandList(Lists.newArrayList("A",10))
                .build();
        ConditionDO conditionDO3 = ConditionDO.builder()
                .operator("==")
                .operandList(Lists.newArrayList("B",20))
                .build();
        ConditionDO conditionDO1 = ConditionDO.builder()
                .operator("and")
                .operandList(Lists.newArrayList(conditionDO2,conditionDO3))
                .build();
        ConditionDO conditionDO4 = ConditionDO.builder()
                .operator("<")
                .operandList(Lists.newArrayList("C",30))
                .build();
        ConditionDO conditionDO5 = ConditionDO.builder()
                .operator("!=")
                .operandList(Lists.newArrayList("D",50))
                .build();
        ConditionDO conditionDO = ConditionDO.builder()
                .operator("or")
                .operandList(Lists.newArrayList(conditionDO4,conditionDO5,conditionDO1))
                .build();
        System.out.println(parase(conditionDO));
    }
}
