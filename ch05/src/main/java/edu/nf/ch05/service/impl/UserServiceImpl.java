package edu.nf.ch05.service.impl;

import edu.nf.ch05.dao.UserDao;
import edu.nf.ch05.dao.impl.UserDaoImpl;
import edu.nf.ch05.entity.Users;
import edu.nf.ch05.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceImpl implements UserService {

    //实例变量
    private UserDao userdao;

    public UserServiceImpl() {

    }

    /**
     * 构造方法注入
     * @param userdao
     */
    public UserServiceImpl(UserDao userdao) {
        this.userdao = userdao;
    }

    /**
     * 提供一个set方法个体spring容器，这个方法就是注入的入口方法
     * 那么spring就会调用这个方法，从容器中将一个UserDao的实现类
     * 给注入进来，赋值给上面的就接口
     * @param dao
     */
    public void setDao(UserDao dao) {
        this.userdao = dao;
    }

    @Override
    public void add(Users user) {
        userdao.save(user);
    }
}
