package accessmodifiers.defaultaccessmodifier.animal;

public class Test {
    public static void main(String[] args){
        Cat cat=new Cat();
        Animal billa = new Cat();
        cat.sayHello();
        billa.sayHello();
    }
}
