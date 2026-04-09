package com.javaseekhega.test;

import com.javaseekhega.animal.Cat;
import com.javaseekhega.animal.Dog;
import com.javaseekhega.human.Child;
import com.javaseekhega.human.GrandParent;
import com.javaseekhega.human.Parent;

public class Test {
    public  static void main(String[] args){
        Cat cat = new Cat();
        cat.makeNoise();
        cat.setName("Whiskers");
        System.out.println(cat.getName());
        Dog dog = new Dog();
        dog.makeNoise();
        dog.setName("Buddy");
        System.out.println(dog.getName());
        GrandParent grandParent = new GrandParent();
        grandParent.grandParentMethod();
        Parent parent = new Parent();
        parent.parentMethod();
        Child child = new Child();
        child.childMethod();
    }
}
