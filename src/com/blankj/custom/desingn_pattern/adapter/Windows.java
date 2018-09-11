package com.blankj.custom.desingn_pattern.adapter;


//适配器模式：
//
//        功能：使用一个现有的接口，它有许多功能，但是我只需要其中的一个，不想重写其他方法,这时候就使用适配器模式。
//
//        实现步骤：
//
//        1，新建一个接口，有许多抽象功能。
//
//        2，新建一个AdapterDemo类来实现这个接口，重写接口的所有功能。
//
//        3，新建一个MyAdapter继承AdapterDemo,重写自己所需的功能。

public interface Windows {
    void max();
    void min();
    void close();
}
