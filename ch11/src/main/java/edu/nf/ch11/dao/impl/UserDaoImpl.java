package edu.nf.ch11.dao.impl;

import edu.nf.ch11.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("插入");
    }
}
