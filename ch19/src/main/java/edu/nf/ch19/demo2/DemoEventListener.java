package edu.nf.ch19.demo2;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * 自定义监听器
 */
@Component
public class DemoEventListener {

    /**
     * 监听处理方法
     * @param event
     * @EventListener 标注当前方法为一个事件监听处理方法
     */
    @EventListener
    public void handlerEvent(DemoEvent event){
        System.out.println("处理消息"+event.getMessage());
    }
}
