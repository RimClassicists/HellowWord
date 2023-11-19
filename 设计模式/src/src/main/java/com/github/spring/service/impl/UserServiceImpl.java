package com.github.spring.service.impl;

import com.github.spring.service.UserService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UserServiceImpl implements UserService {


    @Override
    public void saveUser(String userName) {
        log.info("userName = {}",userName);
    }

    @Override
    public void init() {
        log.info(">>>>>初始化>>>>>>>");
    }

    @Override
    public void destroy() {
        log.info(">>>>>销毁>>>>>>>");
    }
}
