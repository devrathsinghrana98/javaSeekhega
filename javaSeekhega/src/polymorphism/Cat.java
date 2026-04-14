package polymorphism;

public class Cat extends Animal {
    @Override
    public String sayHello() {
        return "Meow";
    }

    public String eat(){
        return "Cat is eating";
    }
}
