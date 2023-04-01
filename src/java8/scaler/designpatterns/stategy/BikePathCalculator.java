package java8.scaler.designpatterns.stategy;

public class BikePathCalculator implements PathCalculatorStrategy {
    private static final BikePathCalculator instance = null;

    @Override
    public void findPath(String source, String destination) {
        System.out.println("Bike route");
    }

    public static BikePathCalculator getInstance() {
        if (instance == null) {
            synchronized (BikePathCalculator.class) {
                if (instance == null) {
                    return new BikePathCalculator();
                }
            }
        }
        return instance;
    }
}
