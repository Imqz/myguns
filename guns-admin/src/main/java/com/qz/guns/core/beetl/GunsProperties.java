package com.qz.guns.core.beetl;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author qinzhi
 * @date 2018/10/9 13:02
 */
@Component
public class GunsProperties {
    public static final String PREFIX = "guns";
    private Boolean kaptchaOpen = false;

    public Boolean getKaptchaOpen() {
        return kaptchaOpen;
    }
}
