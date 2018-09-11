package com.blankj.custom.desingn_pattern.adapter;

public class MyAdapter extends WindowsAdapter {
    @Override
    public void max() {
        super.max();
    }

    @Override
    public void min() {
        super.min();
    }

    @Override
    public void close() {
        System.out.println("实现windows的关闭");
    }
}
