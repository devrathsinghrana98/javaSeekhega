package polymorphism.compiletime;

import polymorphism.Calculator;

public class Test {
    public static void main(String[] args){
        //We are achieving compile time polymorphism here using function overloading
        //as during compile time itself java can identify which overloaded method to call
        //based on signature of different functions
        Calculator calculator=new Calculator();
        System.out.println(calculator.add(1,2));
        System.out.println(calculator.add(1,2,3));
        System.out.println(calculator.add(1.1,2.9));
    }
}
