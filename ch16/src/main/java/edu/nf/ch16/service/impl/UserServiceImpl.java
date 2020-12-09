package edu.nf.ch16.service.impl;

import edu.nf.ch16.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public String add(String name) {
        System.out.println("添加"+name);
        return "success";
    }
}
