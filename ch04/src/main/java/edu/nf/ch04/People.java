package edu.nf.ch04;

public class People {

    public People(){
        System.out.println("执行构造方法");
    }

    /**
     *
     * Spring调用
     * bean的初始化方法,注意：实在对象创建之后执行
     */
    public void init(){
        System.out.println("执行bean的init方法");
    }

    /**
     * spring调用
     * bean的销毁方法，是在bean销毁之前执行
     */
    public void destroy(){
        System.out.println("执行bean的销毁方法");
    }

    public void say(){
        System.out.println("和瓦达");
    }
}
