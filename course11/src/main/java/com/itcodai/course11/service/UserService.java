package com.itcodai.course11.service;

import com.itcodai.course11.entity.User;

import java.util.List;

/**
 * @ProjectName: course11
 * @Package: com.itcodai.course11.service
 * @ClassName: UserService
 * @Author: yuxingsheng
 * @Description:
 * @Date: 2020/3/27 10:52
 * @Version: 1.0
 */

public interface UserService {
    void insertUser(User user);
    void insertUser2(User user) throws Exception;
    void insertUser3(User user);
    void insertUser4(User user);
}
