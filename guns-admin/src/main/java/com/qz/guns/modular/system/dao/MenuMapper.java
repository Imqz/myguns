package com.qz.guns.modular.system.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.qz.guns.core.node.MenuNode;
import com.qz.guns.modular.system.model.Menu;

import java.util.List;


/**
 * @author qinzhi
 * @date 2018/10/12 18:38
 */
public interface MenuMapper extends BaseMapper<Menu> {

    List<MenuNode> getMenusByRoleIds(List<Integer> roleIds);
}
