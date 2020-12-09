package edu.nf.ch14.test;

import edu.nf.ch14.service.StuService;
import edu.nf.ch14.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopTest {
    @Test
    public void testAop(){
        //初始化容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService service = context.getBean("userServiceProxy", UserService.class);
        service.add();
        service.update();

    }

    @Test
    public void testAop2(){
        //初始化容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StuService service = context.getBean("userServiceProxy", StuService.class);
        service.add();


    }


}
