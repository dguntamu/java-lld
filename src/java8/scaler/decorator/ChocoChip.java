package java8.scaler.decorator;

public class ChocoChip implements IceCream{
    //ChocoChip cant be created without any Cone obj,
    //so it depends on Icecream obj
    private IceCream iceCream;
    public ChocoChip(IceCream iceCream){
        this.iceCream = iceCream;
    }
    @Override
    public int getCost() {
        return iceCream.getCost() + 7;
    }

    @Override
    public String getDesc() {
        return iceCream.getDesc() + " ChocoChip";
    }
}
