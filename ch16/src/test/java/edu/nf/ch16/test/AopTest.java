package edu.nf.ch16.test;

import edu.nf.ch16.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopTest {
    @Test
    public void aopTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService service = context.getBean("userService",UserService.class);
        service.add("wawdad");
    }
}
