package com.yxs.springboot.controller;

import com.yxs.springboot.config.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author yuxingsheng
 * @create 2020-02-21 11:02
 * @Param
 */
@Controller
public class ConfigInfoController {

    @Value("${boot.name}")
    private String name;
    @Value("${boot.location}")
    private String location;

    @Autowired
    private Config config;
    @RequestMapping("/boot/config")
    public @ResponseBody String config(){
        return name+"---"+location+"----"+config.getName()+"--"+config.getLocation();
    }
}
