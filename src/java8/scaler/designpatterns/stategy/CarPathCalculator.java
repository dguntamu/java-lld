package java8.scaler.designpatterns.stategy;

public class CarPathCalculator implements PathCalculatorStrategy {
    private static final CarPathCalculator instance = null;

    private CarPathCalculator() {

    }

    @Override
    public void findPath(String source, String destination) {
        System.out.println("Car route");
    }

    public static CarPathCalculator getInstance() {
        if (instance == null) {
            synchronized (CarPathCalculator.class) {
                if (instance == null) {
                    return new CarPathCalculator();
                }
            }
        }
        return instance;
    }
}
