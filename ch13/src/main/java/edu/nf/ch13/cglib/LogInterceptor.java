package edu.nf.ch13.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;


public class LogInterceptor implements MethodInterceptor {

    /**
     *
     * @param proxy 运行时创建的代理对象
     * @param method 当前目标对象正在调用的方法
     * @param args 目标对象所需的参数
     * @param methodProxy 代理方法(也就是生成子类中的方法)
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        //调用目标对象的方法(也就是父类的方法)
        Object returnVal = methodProxy.invokeSuper(proxy,args);
        //调用日志操作
        log();
        return returnVal;
    }

    private  void log(){
        System.out.println("记录日志");
    }
}
