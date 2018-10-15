package com.qz.guns.core.beetl;

import com.qz.guns.core.util.SpringContextHolder;

/**
 * @author qinzhi
 * @date 2018/10/9 13:38
 */
public class KaptchaUtil {

    /**
     * 获取验证码开关
     */
    public static Boolean getKaptchaOnOff() {
        return SpringContextHolder.getBean(GunsProperties.class).getKaptchaOpen();
    }
}
