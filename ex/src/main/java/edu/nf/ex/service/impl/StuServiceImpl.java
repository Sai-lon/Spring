package edu.nf.ex.service.impl;

import edu.nf.ex.dao.StuDao;
import edu.nf.ex.service.StuService;

public class StuServiceImpl implements StuService {


    private StuDao stuDao;

    public void setStuDao(StuDao stuDao) {
        this.stuDao = stuDao;
    }

    @Override
    public void add() {
        System.out.println("毒瓦斯");
        stuDao.wewe();
    }
}
