package com.itcodai.course14.domain;

/**
 * @ProjectName: course14
 * @Package: com.itcodai.course14.domain
 * @ClassName: User
 * @Author: yuxingsheng
 * @Description: 用户类
 * @Date: 2020/7/25 9:28
 * @Version: 1.0
 */
public class User {
    private int id;
    private String userName;
    public User() {

    }
    public User(int id,String userName){
        this.id=id;
        this.userName=userName;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
