package com.itcodai.course10.dao;

import com.itcodai.course10.entity.User;

import java.util.List;

/**
 * @ProjectName: course10
 * @Package: com.itcodai.course10.dao
 * @ClassName: UserMapper
 * @Author: yuxingsheng
 * @Description: 接口
 * @Date: 2020/3/27 10:49
 * @Version: 1.0
 */
public interface UserMapper {

    User getUser(int id);

    User getUserByIdAndName(int id,String name);


    List<User> getAll();

    //使用xml方式
    User getUserByName(String username);

}
