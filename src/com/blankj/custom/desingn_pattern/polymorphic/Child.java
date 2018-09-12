package com.blankj.custom.desingn_pattern.polymorphic;

public class Child extends Parent {
    String name;
    String sex;

    public Child() {
        System.out.println("Child init");
    }

    public void say(){
        System.out.println("Child say");
    }
}
