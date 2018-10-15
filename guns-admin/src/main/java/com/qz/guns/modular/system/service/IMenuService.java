package com.qz.guns.modular.system.service;

import com.baomidou.mybatisplus.service.IService;
import com.qz.guns.core.node.MenuNode;
import com.qz.guns.modular.system.model.Menu;

import java.util.List;

/**
 * @author qinzhi
 * @date 2018/10/15 14:01
 */

public interface IMenuService extends IService<Menu> {
    List<MenuNode> getMenusByRoleIds(List<Integer> roleIds);

}
