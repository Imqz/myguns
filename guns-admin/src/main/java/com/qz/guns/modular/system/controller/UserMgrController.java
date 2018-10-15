package com.qz.guns.modular.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author qinzhi
 * @date 2018/10/12 16:18
 */
@Controller
@RequestMapping("/mgr")
public class UserMgrController {
    /**
     * 跳转到查看用户详情页面
     */
    @RequestMapping("/user_info")
    public String userInfo(Model model) {
        return null;
    }
    /**
     * 跳转到修改密码界面
     */
    @RequestMapping("/user_chpwd")
    public String chPwd() {
        return null;
    }
}
