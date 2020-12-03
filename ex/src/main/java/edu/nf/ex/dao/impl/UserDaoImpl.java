package edu.nf.ex.dao.impl;

import edu.nf.ex.dao.CityDao;
import org.springframework.stereotype.Repository;

import javax.annotation.PreDestroy;

@Repository("cityDao")
public class UserDaoImpl implements CityDao {
    @Override
    public void list() {
        System.out.println("f分谔谔撒");
    }
}
