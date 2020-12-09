package edu.nf.ch19.demo2;

/**
 * 自定义事件对象
 */
public class DemoEvent {
    private String message;

    public DemoEvent(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
