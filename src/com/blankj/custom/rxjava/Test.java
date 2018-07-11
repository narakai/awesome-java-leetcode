package com.blankj.custom.rxjava;

public class Test {
    public static void main(String[] args) {
        Observable.create(new Observable.OnSubscribe<Integer>() {
            @Override
            public void call(Subscriber<? super Integer> subscriber) {
                for (int i = 0; i < 10; i++) {
                    subscriber.onNext(i);
                }
            }
        }).subscribe(new Subscriber<Integer>() {
            @Override
            public void onCompleted() {

            }
            @Override
            public void onError(Throwable t) {

            }
            @Override
            public void onNext(Integer var1) {
                System.out.println(var1);
            }
        });
    }
}
