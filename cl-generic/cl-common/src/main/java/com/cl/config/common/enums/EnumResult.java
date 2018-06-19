package com.cl.config.common.enums;

/**
 * @author:chenglong
 * @dateTime:2018/6/19 17:09
 */
public enum EnumResult implements BaseResult {

    SUCCESS(0, "操作成功"),
    SYSTEM_ERROR(1, "系统或网络繁忙，请稍后重试"),;

    private int code;

    private String message;

    public String toString() {
        return this.getCode() + ":" + this.getMessage();
    }

    EnumResult(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}
