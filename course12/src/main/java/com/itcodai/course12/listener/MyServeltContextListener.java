package com.itcodai.course12.listener;

import com.itcodai.course12.entity.User;
import com.itcodai.course12.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import javax.servlet.ServletContext;

/**
 * @ProjectName: course12
 * @Package: com.itcodai.course12.listener
 * @ClassName: MyServeltContextListener
 * @Author: yuxingsheng
 * @Description: 使用ApplicationListener来初始化一些数据到applicaiton域中的监听器
 * @Date: 2020/4/14 11:04
 * @Version: 1.0
 */
@Component
public class MyServeltContextListener implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        //获取到application上下文
        ApplicationContext applicationContext=contextRefreshedEvent.getApplicationContext();
        //获取对应的Service
        UserService userService=applicationContext.getBean(UserService.class);
        User user=userService.getUser();
        //获取application域对象，将查到的信息放到application域中
        ServletContext application=applicationContext.getBean(ServletContext.class);
        application.setAttribute("user",user);
    }
}
