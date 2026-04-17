package accessmodifiers.defaultaccessmodifier.test;

//import accessmodifiers.defaultaccessmodifier.animal.Animal;
import accessmodifiers.defaultaccessmodifier.animal.Cat;
import accessmodifiers.defaultaccessmodifier.vehicle.Car;
import accessmodifiers.defaultaccessmodifier.vehicle.Vehicle;

public class Test {
    public static void main(String[] args){
        Cat cat=new Cat();
        //Animal billa = new Cat();//'accessmodifiers.defaultaccessmodifier.animal.Animal' is not public in 'accessmodifiers.defaultaccessmodifier.animal'. Cannot be accessed from outside package
        //cat.sayHello();//'sayHello()' is not public in 'accessmodifiers.defaultaccessmodifier.animal.Cat'. Cannot be accessed from outside package
        //billa.sayHello();//'sayHello()' is not public in 'accessmodifiers.defaultaccessmodifier.animal.Animal'. Cannot be accessed from outside package
        Car car = new Car();
        Vehicle ferrari = new Car();
        car.makeNoise();
        ferrari.makeNoise();
    }
}
