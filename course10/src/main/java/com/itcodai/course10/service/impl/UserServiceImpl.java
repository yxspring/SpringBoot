package com.itcodai.course10.service.impl;

import com.itcodai.course10.dao.UserMapper;
import com.itcodai.course10.entity.User;
import com.itcodai.course10.service.UserService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ProjectName: course10
 * @Package: com.itcodai.course10.service.impl
 * @ClassName: UserServiceImpl
 * @Author: yuxingsheng
 * @Description:
 * @Date: 2020/3/27 10:55
 * @Version: 1.0
 */
public class UserServiceImpl  implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User getUser(int id) {
        return userMapper.getUser(id);
    }

    @Override
    public List<User> getAll() {
        return userMapper.getAll();
    }

    @Override
    public User getUserByName(String name) {
        return userMapper.getUserByName(name);
    }

    @Override
    public User getUser(int id, String name) {
        return userMapper.getUserByIdAndName(id,name);
    }
}
