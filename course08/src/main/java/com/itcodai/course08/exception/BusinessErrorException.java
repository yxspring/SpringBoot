package com.itcodai.course08.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @ProjectName: course08
 * @Package: com.itcodai.course08.exception
 * @ClassName: BusinessErrorException
 * @Author: yuxingsheng
 * @Description: 自定义业务异常
 * @Date: 2020/3/24 19:46
 * @Version: 1.0
 */
public class BusinessErrorException  extends RuntimeException {
    private static final long serialVersionUID= -7480022450501760611L;
    /*异常码*/
    private String code;
    /*异常信息*/
    private String message;

    public BusinessErrorException(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
