package java8.scaler.designpatterns.decorator;

public class IceCreamClient {
    public static void main(String[] args) {
        //here OrangeCone is the base and below are the toppings on it.
        //OrangeCone ChockolateScope VenillaCone ChocoChip
        IceCream iceCream = new ChocoChip(
                new VenillaCone(
                        new ChockolateScope(
                                new OrangeCone())));
        System.out.println(iceCream.getCost());
        System.out.println(iceCream.getDesc());
    }
}
