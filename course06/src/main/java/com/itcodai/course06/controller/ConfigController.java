package com.itcodai.course06.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: course06
 * @Package: com.itcodai.course06.controller
 * @ClassName: ConfigController
 * @Author: yuxingsheng
 * @Description: 微服务config
 * @Date: 2020/2/24 15:54
 * @Version: 1.0
 */
@RestController
@RequestMapping("/test")
public class ConfigController {
    private static final Logger logger= LoggerFactory.getLogger(ConfigController.class);
    @Value("${url.orderUrl}")
    private String orderUrl;
    @RequestMapping("/conf")
    public String testConfig(){
        logger.info("订单微服务地址====>"+orderUrl);
        return "success";
    }
}
