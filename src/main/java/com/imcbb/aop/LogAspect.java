package com.imcbb.aop;

import com.imcbb.annotation.LogPrint;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author kevin.chen
 * Date 2023/6/6
 * Time 21:22
 *
 * Aop拦截自定义注解 {@link com.imcbb.annotation.LogPrint LogPrint}
 */
@Slf4j
@Aspect
@Component
public class LogAspect {

//    @Pointcut("execution(* com.imcbb.service.*.*(..))")
//    public void pointcut() {
//    }

    @Around("execution(* com.imcbb.service.*.*(..))&&@annotation(logPrint)")
    public Object around(ProceedingJoinPoint joinPoint, LogPrint logPrint) throws Throwable {

        log.info("AOP拦截打印:{}", logPrint.value());
        return joinPoint.proceed();
    }


}
