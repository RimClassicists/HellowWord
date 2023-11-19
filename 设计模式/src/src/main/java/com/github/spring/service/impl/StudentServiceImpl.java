package com.github.spring.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class StudentServiceImpl implements InitializingBean, DisposableBean {


    @Override
    public void destroy() throws Exception {
        log.info(">>>>>>>>>>>StudentServiceImpl#destroy销毁>>>>>>>>>>>");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info(">>>>>>>>>>>StudentServiceImpl#afterPropertiesSet初始化>>>>>>>>>>>");
    }
}
