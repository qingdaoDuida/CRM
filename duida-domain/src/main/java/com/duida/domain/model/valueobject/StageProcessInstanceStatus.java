package com.duida.domain.model.valueobject;

/**
 * @author haofuwei
 * Created on 2023-01-02 18:06:12
 */
public enum StageProcessInstanceStatus {

    RUNNING(0, "运行中"),
    COMPLETED(1, "已完成"),
    ;

    private Integer code;
    private String desc;

    StageProcessInstanceStatus(Integer code, String desc) {
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
