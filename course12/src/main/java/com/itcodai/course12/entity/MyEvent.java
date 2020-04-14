package com.itcodai.course12.entity;

import org.springframework.context.ApplicationEvent;

/**
 * @ProjectName: course12
 * @Package: com.itcodai.course12.entity
 * @ClassName: MyEvent
 * @Author: yuxingsheng
 * @Description: 自定义事件
 * @Date: 2020/4/14 19:50
 * @Version: 1.0
 */
public class MyEvent extends ApplicationEvent {
    private User user;
    public MyEvent(Object source,User user) {
        super(source);
        this.user=user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
