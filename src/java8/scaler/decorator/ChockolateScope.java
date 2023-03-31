package java8.scaler.decorator;

public class ChockolateScope implements IceCream{
    //ChockolateScope cant be created without any Cone obj,
    //so it depends on Icecream obj
    private IceCream iceCream;

    public ChockolateScope(IceCream iceCream){
        this.iceCream = iceCream;
    }
    @Override
    public int getCost() {
        return iceCream.getCost() + 5;
    }

    @Override
    public String getDesc() {
        return iceCream.getDesc() + " ChockolateScope";
    }
}
