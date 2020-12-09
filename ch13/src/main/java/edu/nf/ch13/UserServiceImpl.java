package edu.nf.ch13;

public class UserServiceImpl implements UserService {
    @Override
    public void add() {
        System.out.println("添加用户");
    }

    @Override
    public void update() {
        System.out.println("更新");
    }

    @Override
    public void getUser() {
        System.out.println("查询");
    }
}
