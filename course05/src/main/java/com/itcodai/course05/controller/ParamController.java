package com.itcodai.course05.controller;

import com.itcodai.course05.bean.User;
import org.springframework.web.bind.annotation.*;

/**
 * @ProjectName: course05
 * @Package: com.itcodai.course05.controller
 * @ClassName: ParamController
 * @Author: yuxingsheng
 * @Description: RequestMapping  RequestBody
 * @Date: 2020/2/27 16:05
 * @Version: 1.0
 */
@RestController
public class ParamController {
    /*RequestParam*/
    @GetMapping(value = "/param")
    public String getParamInfo(@RequestParam String user){
        System.out.println("使用requestParam获取到的user: "+user);
        return "success";
    }
    /*RequestParam*/
    @GetMapping(value = "/users")
    public String getParamInfos(@RequestParam(value = "user",required = false) String userName){
        System.out.println("使用requestParam  利用value user: "+userName);
        return "success";
    }
    @PostMapping(value = "/form1")
    public String getPostParam(@RequestParam String userName,@RequestParam String password){
        System.out.println("userName="+userName);
        System.out.println("Password= "+password);
        return "SUCCESS";
    }
    @PostMapping(value = "/postUser")
    public String getPostParams(User user){
        System.out.println("userName="+user.getUserName());
        System.out.println("password="+user.getPassword());
        System.out.println("Id="+user.getId());
        System.out.println("age="+user.getAge());
        return "Success";
    }
    @PostMapping(value = "/bodyuser")
    public String getBodyUser(@RequestBody User user){
        System.out.println("userName="+user.getUserName());
        System.out.println("password="+user.getPassword());
        System.out.println("Id="+user.getId());
        System.out.println("age="+user.getAge());
        return "Success";
    }

}
