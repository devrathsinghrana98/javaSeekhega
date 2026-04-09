package com.javaseekhega.test;

public class Student {
    private int age;
    private String name;
    private int rollNumber;

    public Student(String name){
        this.name=name;
    }

    public Student(int age){
        this.age=age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0){
            System.out.println("Age can't be negative");
            return;
        }else if(age>120){
            System.out.println("Age can't be greater than 120");
            return;
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
}
