package com.itcodai.course14.controller;

import com.itcodai.course14.interception.UnInterception;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/interceptor")
public class InterceptorController {

    @RequestMapping("/test")
    public String test() {
        return "hello";
    }

    //添加自定义的注解
    @UnInterception
    @RequestMapping("/test2")
    @ResponseBody
    public String test2() {
        return "我没有被拦截住！";
    }
}
