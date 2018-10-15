package com.qz.guns.core.util;



import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.qz.guns.core.common.constant.JwtConstants;
import io.jsonwebtoken.*;

/**
 * @author qinzhi
 * @date 2018/10/11 11:14
 */
public class JwtTokenUtil {
    /**
     * 生成token
     */
    private static String doGenerateToken(Map<String, Object> claims, String subject) {
        final Date createdDate = new Date();
        final Date expirationDate = new Date(createdDate.getTime() + JwtConstants.EXPIRATION * 1000);

        return Jwts.builder()
                .setClaims(claims)
                .setSubject(subject)
                .setIssuedAt(createdDate)
                .setExpiration(expirationDate)
                .signWith(SignatureAlgorithm.HS512, JwtConstants.SECRET)
                .compact();
    }
    /**
     * 生成token(通过用户名和签名时候用的随机数)
     */
    public static String generateToken(String userId) {
        Map<String, Object> claims = new HashMap<>();
        return doGenerateToken(claims, userId);
    }
}
