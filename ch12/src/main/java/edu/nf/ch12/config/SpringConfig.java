package edu.nf.ch12.config;

import edu.nf.ch12.controller.UserController;
import edu.nf.ch12.dao.UserDao;
import edu.nf.ch12.dao.impl.UserDaoImpl;
import edu.nf.ch12.service.UserService;
import edu.nf.ch12.service.impl.StuServiceImpl;
import edu.nf.ch12.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
//使用配置类同样可以扫描，这时就是扫描的Bean
//和配置类使用@Bean注解配置的bean一同纳入到ioc容器中
@ComponentScan(basePackages = "edu.nf.ch12")
public class SpringConfig {
    /**
     * 装配dao
     * 使用bean注解来装配
     * 方法名默认为bean的id
     * 可以通过name属性重新自定义
     */
    @Bean(name = "dao",initMethod = "init",destroyMethod = "destroy")
    //@Scope注解可以声明在方法上
    //@Scope("singleton")


    //@Primary也可以标注在方法上，表示优先注入这个bean
    //@Primary
    public UserDao dao(){
        return new UserDaoImpl();
    }


    /**
     * 装配service
     */
    @Bean
    public UserService userService(UserDao userDao){
        UserServiceImpl service =  new UserServiceImpl();

        //方式一：调用userDao的方法获取dao的bean进行注入
        //service.setUserDao(userDao());



        //方式二：通过传进来的参数来注入
        service.setUserDao(userDao);
        return service;
    }


    /**
     * 装配StuService
     * @param userDao
     * @return
     */
    @Bean
    public UserService stuService(UserDao userDao){
        StuServiceImpl stuService = new StuServiceImpl();
        stuService.setUserDao(userDao);
        return stuService;
    }


    /**
     * 装配UserController
     * 当多个实现类时，会现根据参数的变量名作为id容器中查找
     * 如果找到则直接传入来注入，找不到则引发异常
     * 因此可以结合@Qualifier注解，标识在参数上
     */
    @Bean
    public UserController userController(@Qualifier("stuService") UserService userService){
        UserController controller = new UserController();
        //注入userService
        controller.setUserService(userService);
        return controller;
    }
}
