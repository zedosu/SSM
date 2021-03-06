package org.seckill.dto;

/**
 * 所有ajax请求返回的类型 封装json结果
 * Created by zh on 2/15/2017.
 */
public class SeckillResult<T> {

    private boolean success;

    private T data;

    private String error;

    //成功
    public SeckillResult(boolean success, T data) {
        this.success = success;
        this.data = data;
    }

    //失败
    public SeckillResult(boolean success, String error) {
        this.success = success;
        this.error = error;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
