package com.itcodai.course01.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @ProjectName: course01
 * @Package: com.itcodai.course01.controller
 * @ClassName: StarterController
 * @Author: yuxingsheng
 * @Description: 启动
 * @Date: 2020/2/24 10:22
 * @Version: 1.0
 */
@RestController
@RequestMapping("/start")
public class StarterController {
    @RequestMapping("/SpringBoot")
    public String startSpringBoot(){
        return "Hello Spring Boot start!";
    }
}
