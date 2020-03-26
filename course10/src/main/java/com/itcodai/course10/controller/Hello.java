package com.itcodai.course10.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: course10
 * @Package: com.itcodai.course10.controller
 * @ClassName: Hello
 * @Author: yuxingsheng
 * @Description: hello world
 * @Date: 2020/3/26 15:56
 * @Version: 1.0
 */
@RestController
@RequestMapping("/hello")
public class Hello {
    @GetMapping("/say")
    public String say(){
        return "hello World!";
    }
    @GetMapping("/{name}")
    public String testAop(@PathVariable  String name){
        return "Hello "+name;
    }
    @GetMapping("/exce")
    public String testex(){
       int i=1/0;
       return "success";
    }
}
