package edu.nf.ch07;

import edu.nf.ch07.impl.UserServiceImpl;
import org.springframework.beans.factory.FactoryBean;

/**
 * 自定义FactoryBean，同于创建自定义对象
 * spring容器会调用FactoryBean的Object方法，将返回的对象自动纳入ioc容器中
 */
public class MyFactoryBean implements FactoryBean<UserService> {
    /**
     * 返回的是某一个具体实现类的bean
     * @return
     * @throws Exception
     */
    @Override
    public UserService getObject() throws Exception {
        return null;
    }


    /**
     * 返回的bean类型
     * @return
     */
    @Override
    public Class<?> getObjectType() {
        return UserServiceImpl.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
