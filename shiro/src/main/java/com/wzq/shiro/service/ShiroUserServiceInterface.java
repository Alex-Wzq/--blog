package com.wzq.shiro.service;

import com.wzq.shiro.entity.ShiroUser;

@FunctionalInterface
public interface ShiroUserServiceInterface {

    public ShiroUser getById(long id);

}
