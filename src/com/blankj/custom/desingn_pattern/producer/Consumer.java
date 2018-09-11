package com.blankj.custom.desingn_pattern.producer;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
    private BlockingQueue<String> queue;
    private String consumer;

    public Consumer(BlockingQueue<String> queue, String consumer) {
        this.queue = queue;
        if (null != consumer)
            this.consumer = consumer;
        else
            this.consumer = "null ";
    }

    @Override
    public void run() {
        try {
            String uuid = queue.take();
            System.out.println(consumer + " decayed " + uuid
                    + " " + Thread.currentThread());
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
