package polymorphism;

public class Dog extends Animal {
    @Override
    public String sayHello(){
        return "Bark";
    }

    public String eat(){
        return "Dog is eating";
    }
}
