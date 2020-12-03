package edu.nf.ch09.service.impl;

import edu.nf.ch09.dao.UserDao;
import edu.nf.ch09.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component("userService")
//可以使用service注解来标识业务层
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;


    //注入UserDao
    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public void add() {
        System.out.println("user");
         userDao.save();
    }
}
