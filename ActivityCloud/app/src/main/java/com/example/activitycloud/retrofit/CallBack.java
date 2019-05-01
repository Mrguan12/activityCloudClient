package com.example.activitycloud.retrofit;



public interface CallBack<T> {
    public void onResponse(T data);
    public void onFail(String msg);
}
