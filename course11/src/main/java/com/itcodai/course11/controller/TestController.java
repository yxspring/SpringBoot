package com.itcodai.course11.controller;

import com.itcodai.course11.entity.User;
import com.itcodai.course11.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @ProjectName: course11
 * @Package: com.itcodai.course11.controller
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
    @PostMapping("/addUser")
    public String addUser(@RequestBody User user)throws Exception{
        if(user !=null){
            userService.insertUser(user);
            return "success";
        }else{
            return "false";
        }
    }
    @PostMapping("/addUser2")
    public String addUser2(@RequestBody User user)throws Exception{
        if(user !=null){
            userService.insertUser2(user);
            return "success";
        }else{
            return "false";
        }
    }
    @PostMapping("/addUser3")
    public String addUser3(@RequestBody User user){
        if(user !=null){
            userService.insertUser3(user);
            return "success";
        }else{
            return "false";
        }
    }
    @PostMapping("/addUser4")
    public String addUser4(@RequestBody User user){
        userService.insertUser4(user);
        return "sccess";
    }

}
