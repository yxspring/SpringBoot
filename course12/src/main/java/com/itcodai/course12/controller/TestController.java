package com.itcodai.course12.controller;

import com.itcodai.course12.entity.User;
import org.springframework.web.bind.annotation.*;

import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * @ProjectName: course12
 * @Package: com.itcodai.course12.controller
 * @ClassName: TestController
 * @Author: yuxingsheng
 * @Description: 测试controller
 * @Date: 2020/3/27 18:21
 * @Version: 1.0
 */
@RestController
@RequestMapping("/listener")
public class TestController {
    @GetMapping("/user")
    public User getUser(HttpServletRequest request){
       ServletContext application= request.getServletContext();
       return (User) application.getAttribute("user");
    }
    @GetMapping("/total")
    public String getTotalUser(HttpServletRequest request){
      Integer count=  (Integer)request.getSession().getServletContext().getAttribute("count");
        return "当前在线人数："+count;
    }
    @GetMapping("/total2")
    public String getTotalUser2(HttpServletRequest request, HttpServletResponse response){
        Cookie cookie;
        try {
            //把sessionId记录在浏览器中
           cookie= new Cookie("JSESSIONID", URLEncoder.encode(request.getSession().getId(),"UTF-8"));
           cookie.setPath("/");
           //设置cookie为2天，设置长一点
            cookie.setMaxAge(2*24*60*60);
            response.addCookie(cookie);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        Integer count=(Integer)request.getSession().getServletContext().getAttribute("count");
        return "当前在线人数："+count;
    }
    @GetMapping("/request")
    public String getRequestInfo(HttpServletRequest request){
        System.out.println("requestListener中初始化的name数据："+request.getAttribute("name"));
        return "success";
    }
    @GetMapping("/request2")
    public String getRequsetInfo2(HttpServletRequest request){
        System.out.println("自定义的requestListener中初始化的name数据："+request.getAttribute("name"));
        return "Success";
    }

}
/*关于对redis知识点的疑惑
* 怎么存
* 怎么取
* */