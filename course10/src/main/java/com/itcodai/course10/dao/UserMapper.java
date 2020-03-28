package com.itcodai.course10.dao;

import com.itcodai.course10.entity.User;
import org.apache.ibatis.annotations.*;

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
    /*@Select("select * from user where id = #{id}")
    @Results({
            @Result(property = "username",column = "user_name"),
            @Result(property = "password",column = "password")
    })
    User getUser(int id);*/
    @Select("select * from user where id = #{id}")
    @ResultMap("BaseResultMap")
    User getUser(int id);
    @Select("select * from user where id=#{id} and user_name=#{name}")
    User getUserByIdAndName(@Param("id") int id, @Param("name")String name);

    @Select("select * from user")
    List<User> getAll();

    //使用xml方式
    User getUserByName(String username);

}
