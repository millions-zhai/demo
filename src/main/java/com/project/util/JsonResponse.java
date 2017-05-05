package com.project.util;

/**
 * Created by pc on 2017/5/5.
 */
public class JsonResponse {

    private int status;

    private Object data;

    private String err;

    private static int OK=200;
    private static int NOTOK=500;

    public static JsonResponse ok(Object data){
        JsonResponse response=new JsonResponse();
        response.setData(data);
        response.setStatus(OK);
        return response;
    }

    public static JsonResponse notOk(String err){
        JsonResponse response=new JsonResponse();
        response.setStatus(NOTOK);
        response.setErr(err);
        return response;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getErr() {
        return err;
    }

    public void setErr(String err) {
        this.err = err;
    }

    @Override
    public String toString() {
        return "JsonResponse{" +
                "status=" + status +
                ", data=" + data +
                ", err='" + err + '\'' +
                '}';
    }
}
