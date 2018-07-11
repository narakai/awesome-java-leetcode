package com.blankj.custom.rxjava;

public class Test {
    public static void main(String[] args) {
        Observable.create(new Observable.OnSubscribe<Integer>() {
            //实例化接口实现类，需要override
            @Override
            public void call(Subscriber<? super Integer> subscriber) {
                System.out.println("call method execute");
                for (int i = 0; i < 10; i++) {
                    System.out.println("Prepare data " + i);
                    subscriber.onNext(i);
                }
                subscriber.onCompleted();
            }
        }).subscribe(new Subscriber<Integer>() {
            //实例化接口实现类，需要override
            @Override
            public void onCompleted() {
                System.out.println("onCompleted");
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
