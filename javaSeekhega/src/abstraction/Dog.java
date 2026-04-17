package abstraction;

import abstraction.abstractclass.Animal;

public abstract class Dog extends Animal {//abstract child class allows us to not implement all the abstract methods of parent as eat is package private method so can't be accessed outside package
    @Override
    public void sayHello(){//protected parent abstract method can only be accessed withing inherited class
        System.out.println("Bark");
    }


}
