package com.yxs.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author yuxingsheng
 * @create 2020-02-18 22:26
 * @Param
 */
@Controller
public class HelloController {
    /*@RequestMapping  对象返回的是json 字符串返回的还是字符串*/
    @RequestMapping("/boot/sayHi")
    public @ResponseBody String sayHi(){
        return "hello Spring boot!";
    }
}
