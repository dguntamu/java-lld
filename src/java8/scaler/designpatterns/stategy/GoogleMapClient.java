package java8.scaler.designpatterns.stategy;

public class GoogleMapClient {
    public static void main(String[] args) {
        Maps map = new Maps();
        map.findPath("HYD","MUMBAI",TypeOfModeEnum.BIKE);
    }
}
/*
mmutables -> package in Java
Record -> replaces Immutables
 */