package edu.nf.ch01.factory;

import edu.nf.ch01.Users;

/**
 * 自定义工厂给spring，spring就会使用这个工厂
 * 来创建bean对象，这个自定义本身也会纳入spring容器中管理
 * 因此命名时通常都是xxxFactoryBean。
 */
public class UsersFactoryBean {
    public Users build(){
        return new Users();
    }
}
