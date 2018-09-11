package com.blankj.custom.desingn_pattern.producer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

public class Tester {
    public static void main(String[] args) {
        // 队列
        LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<String>(10);
        ExecutorService service = Executors.newCachedThreadPool();
        for (int i = 0; i < 6; i++) {
            service.submit(new Consumer(queue, "X二代" + i));
            service.submit(new Consumer(queue, "导演" + i));
        }
        for (int i = 0; i < 6; i++) {
            service.submit(new Producer(queue, "黄金酒," + i));
            service.submit(new Producer(queue, "美女演员" + i));
        }
        service.shutdown();
    }
}
