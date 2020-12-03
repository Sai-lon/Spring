package edu.nf.ch02.test;

import edu.nf.ch02.People;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        People people = context.getBean("people",People.class);
        People people1 = context.getBean("people",People.class);
        System.out.println(people);
        System.out.println(people1);
        //people.say();
    }
}
