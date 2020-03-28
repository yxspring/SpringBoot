package com.itcodai.course10.service;

import com.itcodai.course10.entity.User;

import java.util.List;

/**
 * @ProjectName: course10
 * @Package: com.itcodai.course10.service
 * @ClassName: UserService
 * @Author: yuxingsheng
 * @Description:
 * @Date: 2020/3/27 10:52
 * @Version: 1.0
 */

public interface UserService {

    User getUser(int id);

    List<User> getAll();

    User getUserByName(String name);

    User getUser(int id,String name);
}
