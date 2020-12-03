package edu.nf.ch04.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * BeanPostProcessor这个接口称之为Bean后置处理器,它可以在spring容器实例化bean
 * 并完成依赖注入，在执行bean的初始化方法
 * （如：InitializingBean接口、自定义的init-method）前后执行，
 * 用于添加一些其他的处理逻辑
 * （注意：这个接口是针对所有的bean）
 * @author CSL
 */
public class MyPostProcessor implements BeanPostProcessor {
    /**
     * 初始化方法调用前被调用
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("执行postProcessBeforeInitialization");
        return bean;
    }

    /**
     * 初始化方法调用后被调用
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("执行postProcessAfterInitialization");
        return bean;
    }
}
