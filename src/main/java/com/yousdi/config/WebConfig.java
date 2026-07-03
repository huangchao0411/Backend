package com.yousdi.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    private static final String UPLOAD_PATH = "/data/YSDWEB/szyousidi.com/ysdi/upload/";

    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler(new String[]{"/upload/**"}).addResourceLocations(new String[]{"file:/data/YSDWEB/szyousidi.com/ysdi/upload/"});
    }
}
