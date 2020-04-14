package com.itcodai.course12.listener;

import com.itcodai.course12.entity.MyEvent;
import com.itcodai.course12.entity.User;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: course12
 * @Package: com.itcodai.course12.listener
 * @ClassName: MyEventListener
 * @Author: yuxingsheng
 * @Description: 自定义监听器
 * @Date: 2020/4/14 19:51
 * @Version: 1.0
 */
@Component
public class MyEventListener implements ApplicationListener<MyEvent> {

    @Override
    public void onApplicationEvent(MyEvent myEvent) {
        //把事件中的信息获取到
        User user=myEvent.getUser();
        //处理事件，实际项目中可以通知别的微服务或者处理其他逻辑等等
        System.out.println("用户名："+user.getUsername());
        System.out.println("密码:"+user.getPassword());
    }
}
