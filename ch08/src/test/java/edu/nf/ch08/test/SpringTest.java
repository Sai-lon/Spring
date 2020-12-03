package edu.nf.ch08.test;

import edu.nf.ch08.dao.UserDao;
import edu.nf.ch08.entity.Users;
import edu.nf.ch08.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class SpringTest {
    @Test
    public void testFactoryBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserService service = context.getBean("userService", UserService.class);
        List<Users> list = service.listUser();
        list.forEach(users -> System.out.println(users.getName()));
    }
}
