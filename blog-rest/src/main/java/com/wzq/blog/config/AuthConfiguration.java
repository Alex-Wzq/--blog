package com.wzq.blog.config;

import cn.hutool.core.bean.BeanUtil;
import com.wzq.blog.entity.User;
import com.wzq.blog.service.UserService;
import com.wzq.shiro.annotations.EnableShrio;
import com.wzq.shiro.entity.ShiroUser;
import com.wzq.shiro.service.ShiroUserServiceInterface;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@EnableShrio
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
