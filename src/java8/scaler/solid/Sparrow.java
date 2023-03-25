package java8.scaler.bird;

public class Sparrow extends Bird implements BirdFlyInterface{

    @Override
    public void fly(){
        System.out.println("Sparrow flying..");
    }
}
