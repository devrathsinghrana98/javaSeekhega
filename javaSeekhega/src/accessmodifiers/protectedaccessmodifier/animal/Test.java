package accessmodifiers.protectedaccessmodifier.animal;

public class Test {
    public static void main(String[] args){
        Cat cat = new Cat();
        cat.makeNoise();
        Animal animal   =new Animal();
        animal.sayHello();
    }
}
