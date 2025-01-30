package com.example.MyTp1Spring.ws;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // Allow all endpoints
                .allowedOrigins("http://localhost:5173","http://localhost:8081/","http://localhost:8083/") // Replace with your Angular URL
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS");
    }

//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/uploads/**") // Allow access to files in the /uploads directory
//                .addResourceLocations("file:uploads/"); // Directory where images are stored
//    }
}
