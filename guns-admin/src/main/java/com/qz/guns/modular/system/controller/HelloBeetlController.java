package com.qz.guns.modular.system.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author qinzhi
 * @date 2018/10/7 22:32
 */
@Controller
@RequestMapping("/home")
@Slf4j
public class HelloBeetlController {

    /**
     * 测试beetl模板
     *
     * @return
     */
    @RequestMapping("/add")
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView();
        log.info("add request");
        modelAndView.addObject("email", "apk2sf@163.com");
        modelAndView.setViewName("add");
        return modelAndView;
    }
    @RequestMapping(value = "/beetl", method = RequestMethod.GET)
    public String index() {

        return "index";
    }

}
