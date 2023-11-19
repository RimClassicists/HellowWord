package com.github.spring.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class LogHandler {


    @Pointcut("@annotation(com.github.spring.service.AopLog)")
   public void pointCut(){

   }


    /**
     * 前置
     * @param joinPoint
     */
   @Before("pointCut()")
   public void before(JoinPoint joinPoint){
       String method = joinPoint.getSignature().getName();
       log.info("前置通知，方法名称methodeName = {}",method);

   }

    /**
     * 后置
     * @param joinPoint
     */
    @AfterReturning("pointCut()")
    public void afterReturning(JoinPoint joinPoint){
        String method = joinPoint.getSignature().getName();
        log.info("后置通知，方法名称methodeName = {}",method);
    }

    /**
     * 异常通知
     * @param joinPoint
     */
    @AfterThrowing("pointCut()")
    public void afterThrowing(JoinPoint joinPoint){
        String method = joinPoint.getSignature().getName();
        log.info("异常通知，方法名称methodeName = {}",method);
    }

    /**
     * 终结通知
     * @param joinPoint
     */
    @After("pointCut()")
    public void after(JoinPoint joinPoint){
        String method = joinPoint.getSignature().getName();
        log.info("终结通知，方法名称methodeName = {}",method);
    }

    /**
     * 环绕通知
     * @param joinPoint
     */
    @Around("pointCut()")
    public void around(JoinPoint joinPoint){
        String method = joinPoint.getSignature().getName();
        log.info("环绕通知，方法名称methodeName = {}",method);
    }



}
