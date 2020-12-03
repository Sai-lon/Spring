package edu.nf.ch05.dao.impl;

import edu.nf.ch05.dao.UserDao;
import edu.nf.ch05.entity.Users;

public class UserDaoImpl implements UserDao {
    @Override
    public void save(Users user) {
        System.out.println("insert into xxx value(?,?)");
    }
}
