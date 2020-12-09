package edu.nf.ch20.test;

import edu.nf.ch20.service.TaskService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestTask {
    @Test
    public void testTask(){
        //容器创建后就会立即执行定时任务
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        while (true);
    }
}
