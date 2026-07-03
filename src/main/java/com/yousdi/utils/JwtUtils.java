package com.yousdi.utils;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.util.Date;
import java.util.Map;
import org.springframework.util.StringUtils;

public class JwtUtils {
    private static final String APP_KEY = "bb1fb979a1e9047544df42aa529346e3";
    private static final Long EXPIRE = 43200000L;

    public static String generateJwt(Map<String, Object> claims) {
        return Jwts.builder().addClaims(claims).signWith(SignatureAlgorithm.HS256, "bb1fb979a1e9047544df42aa529346e3").setExpiration(new Date(System.currentTimeMillis() + EXPIRE)).compact();
    }

    public static Boolean parseJWT(String jwt) {
        if (StringUtils.hasLength(jwt)) {
            return false;
        } else {
            try {
                Jwts.parser().setSigningKey("bb1fb979a1e9047544df42aa529346e3").parseClaimsJwt(jwt);
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }

            return true;
        }
    }
}

