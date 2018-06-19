package com.cl.common.dto;

import com.cl.common.enums.EnumResult;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author:chenglong
 * @dateTime:2018/6/19 17:09
 */
@Getter
@Setter
@ToString
public final class CommonResponseDto<T> {

    private int code;

    private String msg;

    private T data;


    public CommonResponseDto(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <T> CommonResponseDto<T> success() {
        return new CommonResponseDto<T>(EnumResult.SUCCESS.getCode(), EnumResult.SUCCESS.getMessage(), null);
    }

    public static <T> CommonResponseDto<T> success(T data) {
        return new CommonResponseDto<T>(EnumResult.SUCCESS.getCode(), EnumResult.SUCCESS.getMessage(), data);
    }

    public static <T> CommonResponseDto<T> fail(String msg) {
        return new CommonResponseDto<T>(EnumResult.SYSTEM_ERROR.getCode(), msg, null);
    }

    public static <T> CommonResponseDto<T> fail(Integer code, String msg) {
        return new CommonResponseDto<T>(code, msg, null);
    }

}
