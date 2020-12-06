package edu.nf.ex.config;


import edu.nf.ex.controller.StuController;
import edu.nf.ex.dao.StuDao;
import edu.nf.ex.dao.impl.StuDaoImpl;
import edu.nf.ex.service.StuService;
import edu.nf.ex.service.impl.StuServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "edu.nf.ex")
public class SpringConfig {

    @Bean(name = "dao",initMethod = "init",destroyMethod = "destroy")
    public StuDao dao(){
        return new StuDaoImpl();
    }

    @Bean
    public StuService service(StuDao stuDao){
        StuServiceImpl service = new StuServiceImpl();
        service.setStuDao(stuDao);
        return service;
    }

    @Bean
    public StuController controller(StuService stuService){
        StuController controller = new StuController();
        controller.setService(stuService);
        return controller;
    }

}
