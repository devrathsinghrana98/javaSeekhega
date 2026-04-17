package abstraction.abstractclass;

public class Test {
    public static void main(String[] args){
//        Animal animal = new Animal();'Animal' is abstract; cannot be instantiated
        Animal cat = new Cat();
        cat.sayHello();
        cat.setAge(10);
        cat.setName("Billa");
        System.out.println(cat.getAge());
        System.out.println(cat.getName());
    }
}
