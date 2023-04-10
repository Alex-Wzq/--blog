package com.wzq.blog.base.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(value = {"com.wzq.blog.core.service", "com.wzq.blog.base.controller"})
@Import(value = {CorsConfiguration.class, MybatisPlusConfiguration.class})
public class BaseConfiguration {
}
