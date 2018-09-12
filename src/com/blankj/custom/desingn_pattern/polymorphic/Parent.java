package com.blankj.custom.desingn_pattern.polymorphic;

public class Parent {
    String name = "P";
    String sex = "M";

    public void say(){
        System.out.println("Parent say");
    }

    public Parent() {
        System.out.println("Parent init");
        System.out.println("Parent" + this.name);
        System.out.println("Parent" + this.sex);
    }
}
