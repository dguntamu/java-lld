package java8.scaler.designpatterns.solid;

public class Sparrow extends Bird implements BirdFlyInterface{

    @Override
    public void fly(){
        System.out.println("Sparrow flying..");
    }
}
