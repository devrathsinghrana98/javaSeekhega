package oops;

public class Test {
    public static void main(String[] args){
        Animal animal = new Cat();
        animal.sound();//prints meow due to inheritance and polymorphism
        Animal animal2 = new Dog();
        animal2.sound();//prints bark due to inheritance and polymorphism
        Animal animal3 =new Animal();
        animal3.sound();//prints animal sound due to inheritance and polymorphism
    }
}
