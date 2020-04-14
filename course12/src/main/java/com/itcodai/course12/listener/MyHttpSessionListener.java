package com.itcodai.course12.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @ProjectName: course12
 * @Package: com.itcodai.course12.listener
 * @ClassName: MyHttpSessionListener
 * @Author: yuxingsheng
 * @Description: 使用HttpSessionListener统计在线用户数的监听器
 * @Date: 2020/4/14 17:59
 * @Version: 1.0
 */
@Component
public class MyHttpSessionListener implements HttpSessionListener {
   private static final Logger logger= LoggerFactory.getLogger(MyHttpSessionListener.class);
    /*
        记录在线用户数量
    * */
   public Integer count=0;
   @Override
    public synchronized void sessionCreated(HttpSessionEvent httpSessionEvent){
       logger.info("新用户上线了！");
       count++;
       httpSessionEvent.getSession().getServletContext().setAttribute("count",count);
   }
    @Override
    public synchronized void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        logger.info("用户下线了");
        count--;
        httpSessionEvent.getSession().getServletContext().setAttribute("count", count);
    }
}
