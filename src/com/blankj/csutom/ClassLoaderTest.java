package com.blankj.csutom;


//https://www.jianshu.com/p/5f468de3b806

public class ClassLoaderTest {

    public static void main(String[] args) {
        System.out.println(A.j);
//        System.out.println(A.i);
    }

    static class A {

        static int i = 2;

        //可见类 A 是已经被准备过了，但是尚未初始化.
//        准备阶段负责创建类静态字段，并把它初始化成默认值。这里的初始化，
// 并不是调用代码的静态字段赋值语句和静态代码块，而是把每个静态字段初始化成 JVM 给定的初始值
//        当然也有例外，字段被认为是 constant variable 时，也会在准备阶段被赋值

        static final int j = 3;

        static final int k;

        static {
            i = 3;
            k = 3;
            System.out.println("hello world");
        }
    }
}
