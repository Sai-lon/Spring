package edu.nf.ex.test;

import edu.nf.ex.controller.CityController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    @Test
    public void cityList(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        CityController cityController = context.getBean("controller",CityController.class);
        cityController.city();
    }
}
