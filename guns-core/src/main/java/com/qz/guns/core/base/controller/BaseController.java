package com.qz.guns.core.base.controller;

import com.qz.guns.core.base.tips.SuccessTip;
import com.qz.guns.core.support.HttpKit;

import javax.servlet.http.HttpSession;

/**
 * @author qinzhi
 * @date 2018/10/2 22:19
 */
public class BaseController {

    protected static String REDIRECT = "redirect:";
    protected static SuccessTip SUCCESS_TIP = new SuccessTip();

    protected String getPara(String name) {
        return HttpKit.getRequest().getParameter(name);
    }

    protected HttpSession getSession() {
        return HttpKit.getRequest().getSession();
    }

    protected HttpSession getSession(Boolean flag) {
        return HttpKit.getRequest().getSession(flag);
    }

}
