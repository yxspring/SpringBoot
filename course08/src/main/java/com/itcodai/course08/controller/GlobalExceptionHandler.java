package com.itcodai.course08.controller;

import com.itcodai.course08.exception.BusinessErrorException;
import com.itcodai.course08.util.JsonResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @ProjectName: course07
 * @Package: com.itcodai.course08.controller
 * @ClassName: GlobalExceptionHandler
 * @Author: yuxingsheng
 * @Description: 全局异常处理类
 * @Date: 2020/3/10 19:18
 * @Version: 1.0
 */
@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {
    //打印log
    private static final Logger logger= LoggerFactory.getLogger(GlobalExceptionHandler.class);
    /*1、缺少请求参数异常*/
    @ExceptionHandler(MissingServletRequestParameterException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public JsonResult handleHttpMessageNotReadableException(
            MissingServletRequestParameterException ex){
        logger.error("缺少请求参数，{}",ex.getMessage());
        return new JsonResult("400","缺少必要的请求参数");
    }
    /**
     * 空指针异常
     * @param ex NullPointerException
     * @return
     */
    @ExceptionHandler(NullPointerException.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    public JsonResult handleTypeMismatchException(NullPointerException ex) {
        logger.error("空指针异常，{}", ex.getMessage());
        return new JsonResult("500", "空指针异常了");
    }
    /*拦截业务异常 返回业务异常信息*/
    @ExceptionHandler(BusinessErrorException.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    public JsonResult handleBusinessError(BusinessErrorException ex){
        String code=ex.getCode();
        String message=ex.getMessage();
        return new JsonResult(code,message);
    }

    /*系统异常 总的Exception处理*/
    @ExceptionHandler(Exception.class)
    @ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
    public JsonResult handleUnexpectedServe(Exception ex){
        logger.error("系统异常",ex);
        return new JsonResult("500","系统发生异常，请联系管理员");
    }

}

