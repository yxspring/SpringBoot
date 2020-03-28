package com.itcodai.course10.controller;

import com.itcodai.course10.entity.User;
import com.itcodai.course10.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ProjectName: course10
 * @Package: com.itcodai.course10.controller
 * @ClassName: TestController
 * @Author: yuxingsheng
 * @Description: 测试controller
 * @Date: 2020/3/27 18:21
 * @Version: 1.0
 */
@RestController
public class TestController {
    @Resource
    private UserService userService;

    @RequestMapping("/getUserByName/{name}")
    public User getUserByName(@PathVariable String name){
        return userService.getUserByName(name);
    }
}
