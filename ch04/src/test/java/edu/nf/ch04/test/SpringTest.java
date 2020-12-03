package edu.nf.ch04.test;

import edu.nf.ch04.People;
import edu.nf.ch04.Users;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    @Test
    public void testLife(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
       context.getBean("user", Users.class);
       //在实现类中会提供一个close方法用于关闭容器，因此关闭容器前
        //都会执行所有bean的destroy方法
        ((ClassPathXmlApplicationContext)context).close();
    }
}
