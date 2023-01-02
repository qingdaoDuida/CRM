package com.duida.domain.model.valueobject;

/**
 * @author haofuwei
 * Created on 2023-01-01 18:23:17
 */
public enum StageType {

    START(0, "开始阶段"),
    COMMON(1, "普通阶段"),
    END(2, "结束阶段")
    ;

    private Integer code;
    private String desc;

    StageType(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
