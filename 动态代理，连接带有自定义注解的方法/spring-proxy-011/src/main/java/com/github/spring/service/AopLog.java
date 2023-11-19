package com.github.spring.service;

import java.lang.annotation.*;


/**
 *
 * 自定义注解
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface AopLog {
    String meta() default"";

}
