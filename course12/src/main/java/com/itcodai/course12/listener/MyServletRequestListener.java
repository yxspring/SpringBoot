package com.itcodai.course12.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpServletRequest;

/**
 * @ProjectName: course12
 * @Package: com.itcodai.course12.listener
 * @ClassName: MyServletRequestListener
 * @Author: yuxingsheng
 * @Description: 使用ServletRequestListener获取访问信息
 * @Date: 2020/4/14 19:11
 * @Version: 1.0
 */
@Component
public class MyServletRequestListener implements ServletRequestListener {
    private static final Logger logger=LoggerFactory.getLogger(MyServletRequestListener.class);
    @Override
    public void requestInitialized(ServletRequestEvent servletRequestEvent){
        HttpServletRequest request=(HttpServletRequest)servletRequestEvent.getServletRequest();
        logger.info("Session id 为：{}",request.getRequestedSessionId());
        logger.info("request url 为：{}",request.getRequestURL());
        request.setAttribute("name","yxs");
    }

    @Override
    public void requestDestroyed(ServletRequestEvent servletRequestEvent){
        logger.info("request end");
        HttpServletRequest request=(HttpServletRequest)servletRequestEvent.getServletRequest();
        logger.info("request域中保存的name值为：{}",request.getAttribute("name"));
    }











}
