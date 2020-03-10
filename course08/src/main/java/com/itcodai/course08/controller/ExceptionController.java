package com.itcodai.course08.controller;

import com.itcodai.course08.util.JsonResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * @ProjectName: course07
 * @Package: com.itcodai.course08.controller
 * @ClassName: ExceptionController
 * @Author: yuxingsheng
 * @Description:
 * @Date: 2020/3/10 19:36
 * @Version: 1.0
 */
@RestController
@RequestMapping("/exception")
public class ExceptionController {
    private static final Logger logger= LoggerFactory.getLogger(ExceptionController.class);
    @PostMapping("/test")
    public JsonResult test(@RequestParam("name") String name,
                           @RequestParam("pass") String pass){
        logger.info("name:{}",name);
        logger.info("pass:{}",pass);
        return new JsonResult();
    }
}
