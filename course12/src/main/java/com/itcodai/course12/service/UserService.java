package com.itcodai.course12.service;

import com.itcodai.course12.entity.MyEvent;
import com.itcodai.course12.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ProjectName: course12
 * @Package: com.itcodai.course12.service
 * @ClassName: UserService
 * @Author: yuxingsheng
 * @Description: 用户service
 * @Date: 2020/4/14 10:54
 * @Version: 1.0
 */
@Service
public class UserService {
    @Resource
    private ApplicationContext applicationContext;
    /*发布事件*/
    public User getUser(){
        User user= new User(1L,"yxs","123456");
        MyEvent event=new MyEvent(this,user);
        applicationContext.publishEvent(event);
        return user;
    }

}
