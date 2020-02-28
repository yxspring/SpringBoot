package com.yxs.springboot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/*
* 生成get set方法： 快捷键：alt+insert
* 导入类 alt+enter
* */
//@Component 将当前类变为Spring组件用
@Component
@ConfigurationProperties(prefix = "boot")
public class Config {
    private String name;
    private String location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
