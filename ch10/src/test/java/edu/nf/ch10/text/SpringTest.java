package edu.nf.ch10.text;

import edu.nf.ch10.demo.TestService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    @Test
    public void testProperties(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        TestService testService =  context.getBean("testService", TestService.class);
        testService.say();
    }
}
