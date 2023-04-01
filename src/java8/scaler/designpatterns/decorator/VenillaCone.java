package java8.scaler.designpatterns.decorator;

public class VenillaCone implements IceCream {
    //VenillaCone can be base entity of it can be add-on(Topping)

    private IceCream iceCream;

    //Default construtor tells its a Base Entity
    public VenillaCone() {

    }

    //VenillaCone can be topping as well, in this case there should be IceCream obj available
    public VenillaCone(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        if (iceCream == null)
            return 10;
        return iceCream.getCost() + 10;
    }

    @Override
    public String getDesc() {
        if (iceCream == null)
            return " VenillaCone";
        return iceCream.getDesc() + " VenillaCone";
    }
}
