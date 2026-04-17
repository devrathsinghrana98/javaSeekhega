package accessmodifiers.defaultaccessmodifier.vehicle;

public class Test {
    public static void main(String[] args){
        Car car = new Car();
        Vehicle ferrari = new Car();
        car.makeNoise();
        ferrari.makeNoise();
    }
}
