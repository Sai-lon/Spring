package edu.nf.ch01.test;

import edu.nf.ch01.People;
import edu.nf.ch01.Users;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 在Spring框架中工厂分类为两种
 * 一种是BeanFactory，另一种是ApplicationContext，
 * 简单点说，BeanFactory是Spring最基础的bean工厂，
 * 而applicationContext针对BeanFactory做了很多的功能和增强，
 * 官方也推荐我们使用applicationContext这个接口操作Spring容器
 */
public class SpringContainerTest {
    @Test
    public void testGetBean(){
        //初始化Spring容器(也就是一个容器工厂了)
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //从容器中获取bean对象
        //Users user = (Users) context.getBean("user");
        //使用泛型来获取
        Users user = context.getBean("user",Users.class);
        user.say();
    }
     @Test
    public void testBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        People people = context.getBean("people",People.class);
        people.run();
    }

    @Test
    public void testFactoryBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Users users = context.getBean("user1",Users.class);
        users.say();
    }
}
