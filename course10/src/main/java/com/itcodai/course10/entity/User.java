package com.itcodai.course10.entity;

/**
 * @ProjectName: course10
 * @Package: com.itcodai.course10.entity
 * @ClassName: User
 * @Author: yuxingsheng
 * @Description: entity User mybatis使用
 * @Date: 2020/3/27 10:21
 * @Version: 1.0
 */
public class User {
    private int id;
    private String password;
    private String username;

    public User(int id, String password, String username) {
        this.id = id;
        this.password = password;
        this.username = username;
    }

    public User(String password, String username) {
        this.password = password;
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    }
