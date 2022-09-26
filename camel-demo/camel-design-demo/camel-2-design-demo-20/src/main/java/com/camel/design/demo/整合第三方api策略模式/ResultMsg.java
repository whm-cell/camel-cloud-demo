package com.camel.design.demo.整合第三方api策略模式;

/**
 * @Title: ResultMsg
 * @Description:
 * @author: wanghaiming
 * @date: 2022/9/26 0026 10:47
 * @Version: 1.0
 */
public class ResultMsg {

    private int code;
    private String msg;
    private Object data;

    public ResultMsg(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
