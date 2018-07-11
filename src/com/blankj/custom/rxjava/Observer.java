package com.blankj.custom.rxjava;

public interface Observer<T> {
    void onCompleted();

    void onError(Throwable t);

    void onNext(T var1);
}
