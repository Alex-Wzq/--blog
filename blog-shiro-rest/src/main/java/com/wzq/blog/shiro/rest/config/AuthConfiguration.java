package com.wzq.blog.shiro.rest.config;

import com.wzq.blog.core.service.UserService;
import com.wzq.blog.repository.entity.User;
import com.wzq.shiro.entity.ShiroUser;
import com.wzq.shiro.service.ShiroUserServiceInterface;
import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AuthConfiguration {

    @Bean
    public ShiroUserServiceInterface shiroUserServiceInterface(UserService userService) {
        return id -> {
            ShiroUser shiroUser = new ShiroUser();
            User user = userService.getById(id);
            BeanUtils.copyProperties(user, shiroUser);
            return shiroUser;
        };
    }

}
