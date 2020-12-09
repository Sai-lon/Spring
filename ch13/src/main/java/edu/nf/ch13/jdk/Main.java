package edu.nf.ch13.jdk;

import edu.nf.ch13.UserService;
import edu.nf.ch13.UserServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {

        //创建JDK代理需要满足的三个条件

        //1.创建回调处理器,并传入目标对象
        InvocationHandler handler = new LogInvocationHandler(new UserServiceImpl());
        //2.获取一个类加载器，用于加载动态创建出来的代理字节码，加载成功后就会自动创建一个代理实例
        ClassLoader loader = Main.class.getClassLoader();
        //3.获取目标对象所实现的接口的class
        Class<?>[] classes = UserServiceImpl.class.getInterfaces();
        //4.使用proxy类来创建代理对象，并且创建出来的的代理对象会自动实现上面的接口
        UserService userService = (UserService) Proxy.newProxyInstance(loader,classes,handler);
        //5.调用代理对象
        userService.add();
        userService.getUser();
        userService.update();
    }
}
