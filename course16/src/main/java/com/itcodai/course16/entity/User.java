package com.itcodai.course16.entity;

/**
 * @ProjectName: course16
 * @Package: com.itcodai.course16.entity
 * @ClassName: User
 * @Author: yuxingsheng
 * @Description: 用户类
 * @Date: 2020/7/25 16:02
 * @Version: 1.0
 */
public class User {
    private Integer id;
    private String username;
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
