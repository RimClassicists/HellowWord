package com.github.spring;

import com.github.framework.core.Result;
import com.github.spring.config.MvcConfig;
import com.github.spring.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class ProfileMainDemo {



    @Test
    public void test(){

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MvcConfig.class);
//        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();


        PaymentService paymentService = applicationContext.getBean(PaymentService.class);
        Result result = paymentService.process("5","alipay_san");

        log.error("支付返回 code = {},message = {}",result.getCode(),result.getMessage());



    }
}
