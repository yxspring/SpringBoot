package com.itcodai.course07.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: course07
 * @Package: com.itcodai.course07.controller
 * @ClassName: TestController
 * @Author: yuxingsheng
 * @Description: log测试
 * @Date: 2020/2/24 14:31
 * @Version: 1.0
 */
@RestController
@RequestMapping("/test")
public class TestController {
    private final static Logger logger= LoggerFactory.getLogger(TestController.class);
    @RequestMapping("/log")
    public String testLog(){
        logger.debug("========测试日志debug级别打印=======");
        logger.info("===========测试日志info级别打印===========");
        logger.error("=======测试日志error级别打印=======");
        logger.warn("=======测试日志warn级别打印====");
        //可以使用占位符打印一些参数信息
        String  str1="https://github.com/yxspring";
        String str2="yxspring";
        logger.info("====yxs的个人博客:{}",str1,str2);
        return "success";
    }
}
