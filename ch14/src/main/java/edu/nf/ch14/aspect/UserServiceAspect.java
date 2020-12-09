package edu.nf.ch14.aspect;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

/**
 * 定义一个切面
 * 在这个类中声明需要增强的业务逻辑,
 * 在运行时将切面里面的增强逻辑应用到具体的目标对象上
 * (类似于回调处理器InvocationHandler)
 * 这个切面可以实现更多的接口来完成不同的增强
 *
 *
 * advice(通知/增强)
 * MethodBeforeAdvice接口用于实现前置通知，在调用目标方法前执行的逻辑
 * AfterReturningAdvice接口用于实现后置通知，在目标方法返回后执行的逻辑
 * MethodInterceptor用于实现环绕通知(执行前置通知和后置通知的逻辑)
 * ThrowsAdvice接口用于实现异常通知，在目标方法抛出异常后执行的逻辑
 */
public class UserServiceAspect implements MethodBeforeAdvice, AfterReturningAdvice, MethodInterceptor, ThrowsAdvice {

    /**
     * 前置通知
     * @param method 当前目标对象正在调用的方法
     * @param args  目标方法所需参数
     * @param target  目标对象(被代理的对象)
     * @throws Throwable
     */
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("前置通知");
    }


    /**
     * 后置通知(如果产生了异常，则不会执行后置通知,因为没有正常返回是不会执行的)
     * @param returnValue 目标方法的返回值
     * @param method  目标对象正在调用方法
     * @param args  目标方法所需参数
     * @param target 目标对象(被代理的对象)
     * @throws Throwable
     */
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("后置通知");
    }

    /**
     * 环绕通知(执行前置通知和后置通知的逻辑)
     * @param Invocation  回调处理器，用于调用目标对象的方法
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(MethodInvocation Invocation) throws Throwable {
        System.out.println("环绕前");
        //调用目标对象方法
        Object returnVal = Invocation.proceed();
        System.out.println("环绕后");
        return returnVal;
    }

    /**
     *  异常通知，参照官方文档ThrowAdvice
     *  方法的名称必须叫做afterThrowing
     *  该方法还有三个可选参数(method,args,target)
     *  这三个参数要么全部声明，要么全部省略
     *  但Exception对象必须保留
     * @param e 异常对象
     */
    public void afterThrowing(Exception e){
        System.out.println("异常通知:"+e.getMessage());
    }
}
