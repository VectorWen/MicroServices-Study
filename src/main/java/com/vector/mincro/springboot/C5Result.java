package com.vector.mincro.springboot;

/**
 * author: vector.huang
 * date: 2017/08/23 14:01
 */
public class C5Result {

    private int status;
    private String message;

    public C5Result(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
