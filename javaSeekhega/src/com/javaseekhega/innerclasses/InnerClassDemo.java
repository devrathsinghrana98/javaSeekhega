package com.javaseekhega.innerclasses;

public class InnerClassDemo {
    private int outerValue = 100;
    private static int staticOuterValue = 200;
    
    public void memberInnerClassDemo() {
        MemberInner inner = new MemberInner();
        inner.display();
    }
    
    public class MemberInner {
        private int innerValue = 50;
        
        public void display() {
            System.out.println("Member Inner Class:");
            System.out.println("  Outer value: " + outerValue);
            System.out.println("  Inner value: " + innerValue);
            System.out.println("  Static outer value: " + staticOuterValue);
        }
    }
    
    public static class StaticNestedClass {
        private int nestedValue = 75;
        
        public void display() {
            System.out.println("\nStatic Nested Class:");
            System.out.println("  Nested value: " + nestedValue);
            System.out.println("  Static outer value: " + staticOuterValue);
        }
    }
    
    public void localInnerClassDemo() {
        final int localVar = 25;
        
        class LocalInner {
            void display() {
                System.out.println("\nLocal Inner Class:");
                System.out.println("  Outer value: " + outerValue);
                System.out.println("  Local variable: " + localVar);
            }
        }
        
        LocalInner local = new LocalInner();
        local.display();
    }
    
    public void anonymousInnerClassDemo() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("\nAnonymous Inner Class:");
                System.out.println("  Running anonymous implementation");
                System.out.println("  Outer value: " + outerValue);
            }
        };
        runnable.run();
    }
}
