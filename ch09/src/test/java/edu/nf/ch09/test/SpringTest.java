package edu.nf.ch09.test;

import edu.nf.ch09.controller.UserController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    @Test
    public void testIoc(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
         UserController userController = context.getBean("controller", UserController.class);
         userController.add();
    }
}
