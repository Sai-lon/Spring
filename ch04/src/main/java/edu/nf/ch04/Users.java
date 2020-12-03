package edu.nf.ch04;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Users implements InitializingBean, DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("执行destroy方法");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("执行afterPropertiesSet方法");
    }

    public Users(){
        System.out.println("执行构造方法");
    }

    public void init(){
        System.out.println("执行init方法");
    }

    public void myDestroy(){
        System.out.println("执行myDestroy方法");
    }
}
