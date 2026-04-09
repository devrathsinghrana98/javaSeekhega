package com.javaseekhega.test;

public class TestStudent {
    public static void main(String[] args){
        Student student1 = new Student();
        student1.setAge(-10);
        student1.setAge(121);
        student1.setAge(10);
        student1.setRollNumber(23434);
        student1.setName("Ram");
        System.out.println(student1.getName());
        System.out.println(student1.getRollNumber());
        System.out.println(student1.getAge());
    }
}
