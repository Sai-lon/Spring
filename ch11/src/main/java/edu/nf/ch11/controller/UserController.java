package edu.nf.ch11.controller;

import edu.nf.ch11.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController  {
    @Autowired
    public UserService userService;


    public void save(){
        userService.save();
    }
}
