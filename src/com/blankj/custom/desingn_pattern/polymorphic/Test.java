package com.blankj.custom.desingn_pattern.polymorphic;

public class Test {
    //
//    初始化过程：
//            1. 初始化父类中的静态成员变量和静态代码块 ；
//            2. 初始化子类中的静态成员变量和静态代码块 ；
//            3.初始化父类的普通成员变量和代码块，再执行父类的构造方法；
//            4.初始化子类的普通成员变量和代码块，再执行子类的构造方法；
//
//            （1）初始化父类的普通成员变量和代码块，执行  Y y=new Y();  输出Y
//（2）再执行父类的构造方法；输出X
//（3） 初始化子类的普通成员变量和代码块，执行  Y y=new   Y();  输出Y
//（4）再执行子类的构造方法；输出Z
//
    public static void main(String[] args) {
        Child child = new Child();
        child.say();
        Parent child1 = new Child();
        child1.say();
    }
}
