package com.qz.guns.core.shiro.factory;

import com.qz.guns.modular.system.model.User;
import org.apache.shiro.authc.SimpleAuthenticationInfo;

/**
 * @author qinzhi
 * @date 2018/10/2 23:28
 */
public interface IShiro {

    ShiroUser shiroUser(User user);

    /**
     * 根据账号获取登录用户
     *
     * @param account 账号
     */
    User user(String account);

    /**
     * 获取shiro的认证信息
     */
    SimpleAuthenticationInfo info(ShiroUser shiroUser, User user, String realmName);


}

