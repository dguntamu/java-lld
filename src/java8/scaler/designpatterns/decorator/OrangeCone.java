package java8.scaler.designpatterns.decorator;

public class OrangeCone implements IceCream{
    public OrangeCone(){

    }

    @Override
    public int getCost() {
        return 10;
    }

    @Override
    public String getDesc() {
        return "OrangeCone";
    }
}
