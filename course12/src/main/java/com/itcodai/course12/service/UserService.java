package com.itcodai.course12.service;

import com.itcodai.course12.entity.User;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: course12
 * @Package: com.itcodai.course12.service
 * @ClassName: UserService
 * @Author: yuxingsheng
 * @Description: 用户service
 * @Date: 2020/4/14 10:54
 * @Version: 1.0
 */
@Service
public class UserService {
        /*获取用户信息*/
    public User getUser(){
        return new User(1L,"yxs","123456");
    }
}
