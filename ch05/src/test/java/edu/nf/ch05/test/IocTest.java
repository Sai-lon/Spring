package edu.nf.ch05.test;

import edu.nf.ch05.entity.Users;
import edu.nf.ch05.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocTest {
    @Test
    public void testContainer(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
         UserService service = context.getBean("userService", UserService.class);
         Users users = new Users();
         service.add(users);
    }
}
