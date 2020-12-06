package edu.nf.ch12.dao.impl;

import edu.nf.ch12.dao.UserDao;
import org.springframework.stereotype.Repository;


public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("插入");
    }

    public void init(){
        System.out.println("init方法");
    }

    public void destroy(){
        System.out.println("destroy方法");
    }
}
