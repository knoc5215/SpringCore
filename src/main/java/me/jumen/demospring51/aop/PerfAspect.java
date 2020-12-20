package me.jumen.demospring51.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerfAspect {

    //@Around("execution(* me.jumen..*.EventService.*(..))")    PointCut 표현식 1. execution
    //@Around("@annotation(PerfLogging)") // PointCut 표현식 2. @annotation
    @Around("bean(eventServiceImpl)") // PointCut 표현식 3. bean
    public Object logPerf(ProceedingJoinPoint pjp) throws Throwable {
        long begin = System.currentTimeMillis();
        Object retVal = pjp.proceed();
        System.out.println(System.currentTimeMillis() - begin);
        return retVal;
    }

    @Before("bean(eventServiceImpl)")
    public void before() {
        System.out.println("===========before===========");
    }

    @AfterReturning("bean(eventServiceImpl)")
    public void afterReturning() {
        System.out.println("===========afterReturning===========");
    }

    @AfterThrowing("bean(eventServiceImpl)")
    public void afterThrowing() {
        System.out.println("===========afterThrowing===========");
    }


}
