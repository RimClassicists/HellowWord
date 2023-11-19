package com.github.spring.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class LifeCycleServiceImpl implements BeanFactoryPostProcessor, ApplicationContextAware, InitializingBean, DisposableBean, BeanFactoryAware, BeanNameAware {

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        log.error("LifeCycleServiceImpl#setBeanFactory");
    }

    @Override
    public void setBeanName(String name) {
        log.error("LifeCycleServiceImpl#setBeanName");
    }

    @Override
    public void destroy() throws Exception {
        log.error("LifeCycleServiceImpl#destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.error("LifeCycleServiceImpl#afterPropertiesSet");
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        log.error("LifeCycleServiceImpl#configurableListableBeanFactory");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        log.error("LifeCycleServiceImpl#applicationContext");
    }
}
