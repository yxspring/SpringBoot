package com.itcodai.course05.controller;

import com.itcodai.course05.bean.MicroServiceUtl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
 * @ProjectName: course05
 * @Package: com.itcodai.course05.controller
 * @ClassName: ConfigProController
 * @Author: yuxingsheng
 * @Description: 多个微服务配置
 * @Date: 2020/2/24 16:04
 * @Version: 1.0
 */
@RestController
@RequestMapping("/test")
public class ConfigProController {
    private static final Logger logger= LoggerFactory.getLogger(ConfigController.class);
    @Resource
    private MicroServiceUtl microServiceUtl;

    @RequestMapping("/conf2")
    public String getConfig(){
        logger.info("=====订单微服务配置路径===>"+microServiceUtl.getOrderUrl());
        logger.info("=====用户微服务配置路径===>"+microServiceUtl.getUserUrl());
        logger.info("=====购物车微服务配置路径===>"+microServiceUtl.getShoppingUrl());
        return "success";
    }
}
