package accessmodifiers.defaultaccessmodifier.vehicle;

public class Car extends Vehicle{
    @Override
    public void makeNoise(){
        System.out.println("Vroom");
    }
}
