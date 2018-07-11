package com.blankj.custom.rxjava;

public class Observable<T> {
    final OnSubscribe<T> onSubscribe;

    //构造函数
    private Observable(OnSubscribe<T> onSubscribe) {
        this.onSubscribe = onSubscribe;
    }

// 每个Observable里面有一个OnSubscribe对象，只有一个方法（void call(Subscriber<? super T> subscriber);），
// 用来产生数据流，这是典型的命令模式。
    public static <T> Observable<T> create(OnSubscribe<T> onSubscribe) {
        return new Observable<T>(onSubscribe);
    }

    public void subscribe(Subscriber<? super T> subscriber) {
        subscriber.onStart();
        onSubscribe.call(subscriber);
    }

    public interface OnSubscribe<T> {
        void call(Subscriber<? super T> subscriber);
    }

}
