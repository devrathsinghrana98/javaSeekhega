package accessmodifiers.publicaccessmodifier.test;

import accessmodifiers.publicaccessmodifier.animal.Animal;
import accessmodifiers.publicaccessmodifier.animal.Cat;

public class Test {
    public static void main(String[] args){
        Animal cat = new Cat();
        cat.sayHello();
    }
}
