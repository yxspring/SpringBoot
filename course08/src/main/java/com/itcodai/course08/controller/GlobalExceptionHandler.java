package com.itcodai.course08.controller;

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
    /*缺少请求参数异常*/
    @ExceptionHandler(MissingServletRequestParameterException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public JsonResult handleHttpMessageNotReadableException(
            MissingServletRequestParameterException ex){
        logger.error("缺少请求参数，{}",ex.getMessage());
        return new JsonResult("400","缺少必要的请求参数");
    }


}

