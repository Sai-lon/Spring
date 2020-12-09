package edu.nf.ch19.demo1;


import org.springframework.context.ApplicationEvent;

/**
 * 自定义事件对象
 */
public class MyEvent extends ApplicationEvent {
    /**
     *
     * @param source 事件源
     */
    public MyEvent(Object source) {
        super(source);
    }
}
