package com.biqi.common.exception;

import com.biqi.common.constant.ResultCode;

import java.io.Serializable;

public class UnloginException extends RuntimeException implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer code ;
    private String msg ;

    public UnloginException() {
        this.code = ResultCode.FAIL_UNLOGIN_ERROR.getCode();
        this.msg = ResultCode.FAIL_UNLOGIN_ERROR.getName();
    }

    public UnloginException(String msg) {
        this.code = ResultCode.FAIL_UNLOGIN_ERROR.getCode();
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return msg;
    }

}
