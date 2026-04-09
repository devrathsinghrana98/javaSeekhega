package com.javaseekhega.human;

public class Child extends Parent{
    public Child(){
        super();
        System.out.println("Child constructor");
    }

    public void childMethod(){
        super.parentMethod();
        System.out.println("Child method");
        super.grandParentMethod();
    }
}
