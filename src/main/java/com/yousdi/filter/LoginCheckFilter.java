package com.yousdi.filter;

import com.alibaba.fastjson.JSONObject;
import com.yousdi.utils.Result;
import com.yousdi.utils.JwtUtils;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
@WebFilter(
        filterName = "loginCheckFilter",
        urlPatterns = {"/*"}
)
public class LoginCheckFilter implements Filter {
    private static final Logger log = LoggerFactory.getLogger(LoginCheckFilter.class);

    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("init初始化执行...");
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest)servletRequest;
        HttpServletResponse res = (HttpServletResponse)servletResponse;
        String url = req.getRequestURL().toString();
        log.info("请求URL： {}", url);
        if (!"GET".equals(req.getMethod()) && !url.contains("login")) {
            if ("OPTIONS".equals(req.getMethod())) {
                log.info("跨域检测，放行...");
                filterChain.doFilter(servletRequest, servletResponse);
            } else {
                String jws = req.getHeader("token");
                log.info("请求token： {}", jws);
                if (!StringUtils.hasLength(jws)) {
                    log.info("请求头的token为空，未登录");
                    Result error = Result.error("NOT_LOGIN");
                    String notLogin = JSONObject.toJSONString(error);
                    res.getWriter().write(notLogin);
                } else {
                    try {
                        JwtUtils.parseJWT(jws);
                    } catch (Exception e) {
                        e.printStackTrace();
                        log.info("解析令牌失败，返回登录信息");
                        Result error = Result.error("NOT_LOGIN");
                        String notLogin = JSONObject.toJSONString(error);
                        res.getWriter().write(notLogin);
                        return;
                    }

                    log.info("令牌合法，放行...");
                    filterChain.doFilter(servletRequest, servletResponse);
                }
            }
        } else {
            log.info("登录或get请求，放行...");
            filterChain.doFilter(servletRequest, servletResponse);
        }
    }

    public void destroy() {
        log.info("destroy执行了...");
    }
}

