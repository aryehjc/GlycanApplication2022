package com.example.demo.controller;

import java.nio.file.Path;
import java.nio.file.Paths;
 
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
 
@Configuration
public class MvcConfig implements WebMvcConfigurer {
 
 
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        Path uploadDir = Paths.get("/home/aryeh/db_images");
        String uploadPath = uploadDir.toFile().getAbsolutePath();
         
        registry.addResourceHandler("/home/aryeh/db_images/**").addResourceLocations("file:" + uploadPath + "/");
    }
}
