package abstraction.abstractclass;

public class Cat extends Animal{
    @Override
    public void sayHello(){
        System.out.println("Meow");
    }

    @Override
    public void eat(){
        System.out.println("Cat is eating");
    }
}
