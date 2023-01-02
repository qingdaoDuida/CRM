package com.duida.domain.model.valueobject;

/**
 * @author haofuwei
 * Created on 2023-01-02 18:35:11
 */
public enum StageInstanceStatus {

    ACTIVE(1, "活跃的"),
    INACTIVE(0, "不活跃的");

    private Integer code;
    private String desc;

    StageInstanceStatus(Integer code, String desc) {
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
