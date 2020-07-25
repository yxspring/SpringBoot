package com.itcodai.course16.realm;

import com.itcodai.course16.service.UserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import javax.annotation.Resource;

/**
 * @ProjectName: course16
 * @Package: com.itcodai.course16.realm
 * @ClassName: MyRealm
 * @Author: yuxingsheng
 * @Description: 我的Realm
 * @Date: 2020/7/25 15:59
 * @Version: 1.0
 */
public class MyRealm extends AuthorizingRealm {
    @Resource
    private UserService userService;
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        //获取用户名
        String username=(String)principalCollection.getPrimaryPrincipal();
        SimpleAuthorizationInfo authorizationInfo=new SimpleAuthorizationInfo();
        //给该用户设置角色，角色信息存在t_role表中取
        authorizationInfo.setRoles(userService.getRoles(username));
        //给该用户设置权限,权限信息存在t_permission表中取
        authorizationInfo.setStringPermissions(userService.getPermissions(username));
        return authorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        return null;
    }
}
