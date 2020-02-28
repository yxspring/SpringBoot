package com.itcodai.course01.controller;

import com.itcodai.course01.bean.User;
import com.itcodai.course01.util.JsonResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ProjectName: course01
 * @Package: com.itcodai.course01.controller
 * @ClassName: Json
 * @Author: yuxingsheng
 * @Description: 各种数据类型的json数据格式 使用JsonResult类转换
 * @Date: 2020/2/24 10:21
 * @Version: 1.0
 */
@RestController
@RequestMapping("/jsonResult")
public class JsonResultController2 {
    @RequestMapping("/user")
    public JsonResult<User> getUser(){
        User user=new User(1,"yxs","123456");
        return new JsonResult<User>(user);
    }
    @RequestMapping("/list")
    public JsonResult<List<User>> getUserList(){
        List<User> userList=new ArrayList<>();
        userList.add(new User(1,"yxs","123"));
        userList.add(new User(2,"yxs2","456"));
        return  new JsonResult<List<User>>(userList);
    }
    @RequestMapping("/map")
    public JsonResult<Map<String,Object>> getUserMap(){
        Map<String,Object> map=new HashMap<>(3);
        map.put("用户信息",new User(1,"yxs","123456789"));
        map.put("博客地址","https://github.com/yxspring/");
        map.put("今天是","2020/02/24");
        return new JsonResult<Map<String,Object>>(map,"获取map成功");
    }
}
