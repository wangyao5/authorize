package com.letv.vo;

public class Result {
    private int status;
    private String msg;
    private Object object;
    private Result(){}

    public static Result createSuccessResult(String msg, Object object) {
        Result result = new Result();
        result.setStatus(0);
        result.setMsg(msg);
        result.setObject(object);
        return result;
    }

    public static Result createFailedResult(String msg, Object object) {
        Result result = new Result();
        result.setStatus(1);
        result.setMsg(msg);
        result.setObject(object);
        return result;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
