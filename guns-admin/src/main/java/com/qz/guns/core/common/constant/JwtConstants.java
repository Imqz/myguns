package com.qz.guns.core.common.constant;

/**
 * @author qinzhi
 * @date 2018/10/11 11:18
 */
public interface JwtConstants {
    String AUTH_HEADER = "Authorization";

    String SECRET = "defaultSecret";

    Long EXPIRATION = 604800L;

    String AUTH_PATH = "/gunsApi/auth";
}
