package edu.nf.ex.dao.impl;

import edu.nf.ex.dao.StuDao;

public class StuDaoImpl  implements StuDao {
    @Override
    public void wewe() {
        System.out.println("出去");
    }

    public void init(){
        System.out.println("init方法");
    }

    public void destroy(){
        System.out.println("destroy方法");
    }
}
