package edu.nf.ch19.demo1;

/**
 * 自定义事件源
 */
public class MySource {

    private String message;

    public MySource() {
    }

    public MySource(String message) {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
