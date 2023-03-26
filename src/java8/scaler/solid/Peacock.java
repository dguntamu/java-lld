package java8.scaler.solid;

public class Peacock extends Bird implements BirdFlyInterface, BirdDance{
    public void fly(){
        System.out.println("Peacock flying...");
    }
    public void dance(){
        System.out.println("Peacock dancing...");
    }
}
