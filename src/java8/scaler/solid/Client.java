package java8.scaler.bird;

public class Client {
    public static void main(String[] args) {
        Bird sparrow = new Sparrow();
        Sparrow s = new Sparrow();

        //sparrow.fly(); // cant refer as fly() is not part of Bird
        //sparrow.breath();
        s.fly();
        s.breath();
    }
}
