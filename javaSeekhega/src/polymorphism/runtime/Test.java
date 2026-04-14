package polymorphism.runtime;

import polymorphism.Animal;
import polymorphism.Cat;
import polymorphism.Dog;

public class Test {
    public static void main(String[] args){

        
        // Runtime polymorphism - method is overridden in Dog class
        // Why runtime as we have referenced Animal class in animalRef
        // so, in compile time java cannot judge which object method to actually call
        // It is only during run time java can judge which object method to call
        // This is called runtime polymorphism
        // And calling method is called dynamic method dispatch (where overriden method is called)

        Animal animalRef=new Dog();//this is upcasting as we are upcasting Dog to Animal
        Dog doggy=(Dog)animalRef;//this is downcasting as we are downcasting Animal to Dog
        System.out.println(animalRef.sayHello()); // Calls overridden method
        //cat.eat(); This is invalid as only overridden methods can be accessed

    }
}
