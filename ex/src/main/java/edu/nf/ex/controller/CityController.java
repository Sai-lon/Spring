package edu.nf.ex.controller;

import edu.nf.ex.service.CityService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller("controller")
@Scope("prototype")
public class CityController {

    @Resource(name = "cityService")
    private CityService cityService;


    public void setCityService(CityService cityService) {
        this.cityService = cityService;
    }

    public void city(){
        System.out.println("城市");
        cityService.service();
    }

    public void init(){
        System.out.println("init方法");
    }

    public void destroy(){
        System.out.println("destroy方法");
    }
}
