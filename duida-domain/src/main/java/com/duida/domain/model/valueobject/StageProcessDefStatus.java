package com.duida.domain.model.valueobject;

/**
 * @author haofuwei
 * Created on 2023-01-02 17:23:22
 */
public enum StageProcessDefStatus {

    IN_DESIGN(0, "设计中"),
    IN_USE(1, "使用中"),
    ARCHIVED(2, "已归档"),
    ;

    private Integer code;
    private String desc;

    StageProcessDefStatus(Integer code, String desc) {
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
