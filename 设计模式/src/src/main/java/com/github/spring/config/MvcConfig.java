package com.github.spring.config;


import com.github.spring.service.UserService;
import com.github.spring.service.impl.TeacherServiceImpl;
import com.github.spring.service.impl.UserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.github.spring")
@Slf4j
public class MvcConfig {



    //环境dev
//    @Scope("singleton")
//    @Scope("prototype")
    @Bean(name = "userService1",initMethod="init",destroyMethod = "destroy")
//    @Profile("dev")
    public UserService userService(){
//        log.info(">>>>>>>>dev环境>>>>>>>>>>");
        return new UserServiceImpl();
    }


//    //环境pro
//    @Bean(name = "userService2")
//    @Profile("pro")
//    public UserService userService2(){
//        log.info(">>>>>>>>pro环境>>>>>>>>>>");
//        return new UserServiceImpl();
//    }


    @Bean
    public TeacherServiceImpl teacherService(){
        return new TeacherServiceImpl();
    }

}
