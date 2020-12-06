package edu.nf.ch12.controller;

import edu.nf.ch12.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;


public class UserController {


    public UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void add(){
        userService.save();
    }
}
