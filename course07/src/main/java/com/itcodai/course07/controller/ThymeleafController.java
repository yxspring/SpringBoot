package com.itcodai.course07.controller;

import com.itcodai.course07.entry.Blogger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ProjectName: course07
 * @Package: com.itcodai.course07.controller
 * @ClassName: ThymeleafController
 * @Author: yuxingsheng
 * @Description: 测试类controller
 * @Date: 2020/3/5 19:16
 * @Version: 1.0
 */
@Controller
@RequestMapping("/thymeleaf")
public class ThymeleafController {
    @GetMapping("/test404")
    public String test404(){
        return "index";
    }
    @GetMapping("/test500")
    public String test500(){
        int i=1/0;
        return "index";
    }

    @GetMapping("/getBlogger")
    public String getBlogger(Model model) {
        Blogger blog=new Blogger(1L,"ys","123456");
        model.addAttribute("blogger",blog);
        return "blogger";
    }
}
