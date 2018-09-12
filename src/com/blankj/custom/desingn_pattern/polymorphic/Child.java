package com.blankj.custom.desingn_pattern.polymorphic;

public class Child extends Parent {
    String name = "C";
    String sex = "F";

    public Child() {
        System.out.println("Child init");
        System.out.println("Child" + this.name);
        System.out.println("Child" + this.sex);
        System.out.println("Child" + super.name);
        System.out.println("Child" + super.sex);
    }

    public void say(){
        System.out.println("Child say");
    }
}
