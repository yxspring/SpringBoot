package com.itcodai.course16.dao;

import com.itcodai.course16.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.Set;

/**
 * @ProjectName: course16
 * @Package: com.itcodai.course16.dao
 * @ClassName: UserDao
 * @Author: yuxingsheng
 * @Description: 数据库查询接口类
 * @Date: 2020/7/25 16:07
 * @Version: 1.0
 */
public interface UserDao {
    @Select("select * from t_user where username = #{username}")
    User getByUsername(String username);
    @Select("select r.rolename from t_user u,t_role r " +
            "where u.role_id = r.id and u.username = #{username}")
    Set<String> getRoles(String username);
    @Select("select p.permissionname from t_user u,t_role r,t_permission p " +
            "where u.role_id = r.id and p.role_id = r.id and u.username = #{username}")
    Set<String> getPermissions(String username);
}
