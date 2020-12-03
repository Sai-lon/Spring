package edu.nf.ch03.test;

import edu.nf.ch03.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    @Test
    public void testIdAndName(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        People people = context.getBean("people",People.class);
        System.out.println(people);
        //根据别名获取bean实例
        People p1 = context.getBean("people",People.class);
        People p2 = context.getBean("people",People.class);
        System.out.println(p1);
        System.out.println(p2);
    }
}
