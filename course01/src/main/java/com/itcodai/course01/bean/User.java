package com.itcodai.course01.bean;

/**
 * @ProjectName: course01
 * @Package: com.itcodai.course01.bean
 * @ClassName: User
 * @Author: yuxingsheng
 * @Description: 用户bean
 * @Date: 2020/2/24 10:38
 * @Version: 1.0
 */
public class User {
    private long id;
    private String userName;
    private String password;

    public User(long id, String userName, String password) {
        this.id = id;
        this.userName = userName;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
