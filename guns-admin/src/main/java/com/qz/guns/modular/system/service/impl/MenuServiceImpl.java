package com.qz.guns.modular.system.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.qz.guns.core.node.MenuNode;
import com.qz.guns.modular.system.dao.MenuMapper;
import com.qz.guns.modular.system.model.Menu;
import com.qz.guns.modular.system.service.IMenuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author qinzhi
 * @date 2018/10/15 16:10
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements IMenuService {
    @Resource
    private MenuMapper menuMapper;
    @Override
    public List<MenuNode> getMenusByRoleIds(List<Integer> roleIds) {
        return this.baseMapper.getMenusByRoleIds(roleIds);
    }
}
