package com.github.spring.service.impl;


import lombok.extern.slf4j.Slf4j;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Slf4j
public class TeacherServiceImpl {



    @PostConstruct
    public void init(){
        log.info("PostConstruct初始化");
    }



    @PreDestroy
    public void destroy(){
        log.info("PreDestroy销毁");
    }

}
