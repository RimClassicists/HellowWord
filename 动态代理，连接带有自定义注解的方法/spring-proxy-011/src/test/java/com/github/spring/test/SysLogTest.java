package com.github.spring.test;

import com.github.spring.config.DataSourceConfig;
import com.github.spring.entrity.SysLog;
import com.github.spring.service.SysLogService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class SysLogTest {



    @Test
    public void TestDataSource(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(DataSourceConfig.class);
        System.setProperty("spring.profiles.active","master");
     /*   applicationContext.register(DataSourceConfig.class);
        applicationContext.refresh();
*/
        String[] beanNames = applicationContext.getBeanDefinitionNames();
        for (String name: beanNames){
            log.info("String bean name = --------------{}",name);
        }

        SysLogService sysLogService  = applicationContext.getBean(SysLogService.class);
        SysLog sysLog = new SysLog();
        sysLog.setDescription("描述");
        sysLog.setParams("参数");
        sysLogService.insertSysLog(sysLog);


    }
}
































