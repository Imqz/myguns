package com.qz.guns.modular.system.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.qz.guns.modular.system.model.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper extends BaseMapper<User> {
    /**
     * 通过账号获取用户
     */
    User getByAccount(@Param("account") String account);
}
