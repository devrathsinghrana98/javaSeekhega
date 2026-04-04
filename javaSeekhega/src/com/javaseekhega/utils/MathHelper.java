package com.javaseekhega.utils;

public class MathHelper {
    
    public static final double PI = 3.14159;
    
    public static int add(int a, int b) {
        return a + b;
    }
    
    public static int multiply(int a, int b) {
        return a * b;
    }
    
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
    
    public static int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
}
