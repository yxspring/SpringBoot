package com.itcodai.course11.dao;

import com.itcodai.course11.entity.User;
import org.apache.ibatis.annotations.*;

/**
 * @ProjectName: course11
 * @Package: com.itcodai.course11.dao
 * @ClassName: UserMapper
 * @Author: yuxingsheng
 * @Description: 接口
 * @Date: 2020/3/27 10:49
 * @Version: 1.0
 */
public interface UserMapper {

    @Insert("insert into user(user_name,password) values(#{username},#{password})")
    Integer insertUser(User user);

}
