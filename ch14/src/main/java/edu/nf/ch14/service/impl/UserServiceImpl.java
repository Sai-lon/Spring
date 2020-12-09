package edu.nf.ch14.service.impl;

import edu.nf.ch14.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public void add() {
        System.out.println("添加");
    }

    @Override
    public void update() {
        System.out.println("修改");
    }
}
