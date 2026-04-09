package com.javaseekhega.human;

public class Parent extends GrandParent{
    public Parent(){
        super();
        System.out.println("Parent constructor");
    }

    public void parentMethod(){
        System.out.println("Parent method");
        super.grandParentMethod();
    }
}
