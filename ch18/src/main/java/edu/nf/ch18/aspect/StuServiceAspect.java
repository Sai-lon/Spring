package edu.nf.ch18.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * //使用@Aspect注解标注当前类为一个切面
 * @Component标识为受ioc容器管理
 */
@Aspect
@Component
public class StuServiceAspect {

    /**
     * 定义切入点，只能给定义一个方法，不需要任何逻辑
     * 此方法仅仅用于使用给@Pointcut注解标注，用于声明
     * 切入点表达式
     */
    @Pointcut("execution(* edu.nf.ch18.service.impl.*.*(..))")
    public void pointcut(){

    }


    /**
     * 前置通知
     * @param jp
     */
    @Before("pointcut()")
    public void before(JoinPoint jp){
        System.out.println("前置通知,参数："+jp.getArgs()[0]);
    }



    /**
     * 后置通知
     * @param jp
     * @param returnVal
     */
    @AfterReturning(value = "pointcut()",returning = "returnVal")
    public void afterReturning(JoinPoint jp,String returnVal){
        System.out.println("后置通知，返回："+returnVal);
    }

    /**
     * 环绕通知
     * @param pjp
     * @throws Throwable
     */
    @Around("pointcut()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable{
        System.out.println("环绕通知前");
        Object Val = pjp.proceed();
        System.out.println("环绕通知后");
        return Val;
    }

    /**
     * 异常通知
     * @param jp
     * @param e
     */
    @AfterThrowing(value = "pointcut()",throwing ="e")
    public void afterThrowing(JoinPoint jp,Exception e){
        System.out.println("异常通知,异常:"+e.getMessage());
    }

    /**
     * 最终通知
     * @param jp
     */
    @After("pointcut()")
    public void after(JoinPoint jp){
        System.out.println("最后通知");
    }
}
