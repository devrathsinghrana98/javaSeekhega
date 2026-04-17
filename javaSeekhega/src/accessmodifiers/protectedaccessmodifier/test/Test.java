package accessmodifiers.protectedaccessmodifier.test;

import accessmodifiers.protectedaccessmodifier.animal.Animal;

public class Test {
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.makeNoise();
        Animal animal = new Animal();
//        animal.sayHello();//'sayHello()' has protected access in 'accessmodifiers.protectedaccessmodifier.animal.Animal'
    }
}
