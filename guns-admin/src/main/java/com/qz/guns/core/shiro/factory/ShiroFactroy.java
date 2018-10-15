package com.qz.guns.core.shiro.factory;

import com.qz.guns.core.util.SpringContextHolder;
import com.qz.guns.modular.system.dao.UserMapper;
import com.qz.guns.modular.system.model.User;
import org.apache.shiro.authc.CredentialsException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.util.ByteSource;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author qinzhi
 * @date 2018/10/2 23:45
 */
@Service
@DependsOn("springContextHolder")
public class ShiroFactroy implements IShiro {

    @Resource
    private UserMapper userMapper;

    public static IShiro me() {
        return SpringContextHolder.getBean(IShiro.class);
    }

    @Override
    public ShiroUser shiroUser(User user) {
        ShiroUser shiroUser = new ShiroUser();
        shiroUser.setId(user.getId());
        shiroUser.setAccount(user.getAccount());
        shiroUser.setDeptId(user.getDeptid());
        shiroUser.setName(user.getName());
        return shiroUser;
    }

    @Override
    public User user(String account) {
        User user = userMapper.getByAccount(account);
        // 账号不存在
        if (null == user) {
            System.out.println("==========================================================================");
            throw new CredentialsException();
        }
        return user;
    }

    @Override
    public SimpleAuthenticationInfo info(ShiroUser shiroUser, User user, String realmName) {
        String credentials = user.getPassword();
        // 密码加盐处理
        String source = user.getSalt();
        ByteSource credentialsSalt = new Md5Hash(source);
        return new SimpleAuthenticationInfo(shiroUser, credentials, credentialsSalt, realmName);
    }


}