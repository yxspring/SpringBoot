package com.itcodai.course05.bean;

/**
 * @ProjectName: course05
 * @Package: com.itcodai.course05.bean
 * @ClassName: User
 * @Author: yuxingsheng
 * @Description: 用户
 * @Date: 2020/2/28 14:20
 * @Version: 1.0
 */
public class User {
    private String userName;
    private String password;
    private Integer age;
    private Long id;

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
