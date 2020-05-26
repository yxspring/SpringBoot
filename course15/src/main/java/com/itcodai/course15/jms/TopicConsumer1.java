package com.itcodai.course15.jms;

import com.itcodai.course15.config.ActiveMqConfig;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: course15
 * @Package: com.itcodai.course15.jms
 * @ClassName: TopicConsumer1
 * @Author: yuxingsheng
 * @Description: topic发布和订阅消息
 * @Date: 2020/5/26 17:09
 * @Version: 1.0
 */
@Service
public class TopicConsumer1 {
    @JmsListener(destination = ActiveMqConfig.TOPIC_NAME,containerFactory = "topicListenerContainer")
    public  void receiveTopicMsg(String msg){
        System.out.println("接收到的消息为："+msg);
    }
}
