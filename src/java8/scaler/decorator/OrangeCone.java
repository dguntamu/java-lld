package java8.scaler.decorator;

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
