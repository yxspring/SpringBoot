package com.yxs.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*@SpringBootApplication  代表这是一个Spring boot的应用程序*/
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        /*启动了Spring boot程序，启动Spring 容器，启动内嵌的tomcat */
        SpringApplication.run(Application.class, args);
    }

}
