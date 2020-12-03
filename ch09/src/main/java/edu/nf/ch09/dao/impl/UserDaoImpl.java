package edu.nf.ch09.dao.impl;

import edu.nf.ch09.dao.UserDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component("userDao")
//dao就可以使用Repository注解来标识dao层
@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("sdadlajdlkjad");
    }
}
