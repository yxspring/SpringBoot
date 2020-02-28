package com.itcodai.course05.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @ProjectName: course05
 * @Package: com.itcodai.course05.controller
 * @ClassName: ReController
 * @Author: yuxingsheng
 * @Description: RestController、RequestMapping、PathVariable、RequestParam
 * RequestBoday
 * @Date: 2020/2/27 15:09
 * @Version: 1.0
 */
@RestController
@RequestMapping(value = "/test",produces = "application/json;charset=utf-8")
public class ReController {
    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public String  testGet(){
        return "succss";
    }
    /*@PathVariable  参数 */
    @GetMapping(value = "/user/{id}")
    public String getVariableString(@PathVariable Integer id){
        System.out.println("获取到的id为---->"+id);
        return "success";
    }
    /*@PathVariable  参数名不一样 就是用value */
    @GetMapping(value = "/user2/{idd}")
    public String getVariableStringValue(@PathVariable(value = "idd") Integer id){
        System.out.println("获取到的id为----idd>"+id);
        return "success";
    }
    /*@PathVariable  多个占位符 */
    @GetMapping(value = "/user3/{name}/{id}")
    public String getVariableMore(@PathVariable(value = "name") String userName,
                                  @PathVariable Integer id){
        System.out.println("获取到的用户名是"+userName+" "+"id是"+id);
        return "success";
    }

}


