package com.qz.guns.core.beetl;
import org.beetl.ext.spring.BeetlGroupUtilConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;

/**
 * @author qinzhi
 * @date 2018/10/9 12:37
 */
public class BeetlConfiguration extends BeetlGroupUtilConfiguration {

    @Autowired
    Environment env;

    @Autowired
    ApplicationContext applicationContext;

    @Override
    public void initOther() {
        groupTemplate.registerFunctionPackage("kaptcha", new KaptchaUtil());

    }
}
