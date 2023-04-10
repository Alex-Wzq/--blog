package com.wzq.blog.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wzq.blog.entity.User;
import com.wzq.blog.mapper.UserMapper;
import org.springframework.stereotype.Service;

@Service
public class UserService extends ServiceImpl<UserMapper, User> {
}
