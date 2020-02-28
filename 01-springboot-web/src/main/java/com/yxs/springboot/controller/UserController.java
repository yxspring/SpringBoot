package com.yxs.springboot.controller;

import com.yxs.springboot.bean.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @RequestMapping("/spring/getUser")
    public Object getUser(){
        return new User(1,"yxs");
    }
    /*@GetMapping= @RequestMapping+RequestMethod.GET
    */
    @RequestMapping(value = "/spring/getUser1",method = RequestMethod.GET)
    public Object getUser1(){
        return new User(2,"yxs.GetMapping");
    }
    @GetMapping("/spring/getUser2")
    public Object getUser2(){
        return new User(3,"GetMapping");
    }
    @PostMapping("/spring/getUser3")
    public Object getUser3(){
        return new User(4,"PostMapping");
    }
}
