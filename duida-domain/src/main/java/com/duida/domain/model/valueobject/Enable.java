package com.duida.domain.model.valueobject;

/**
 * @author haofuwei
 * Created on 2023-01-01 19:06:07
 */
public enum Enable {

    ENABLE(1, "启用"),
    DISABLE(-1, "禁用")
    ;

    private Integer code;
    private String desc;

    Enable(Integer code, String desc) {
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
