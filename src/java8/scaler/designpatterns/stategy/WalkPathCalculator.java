package java8.scaler.designpatterns.stategy;

public class WalkPathCalculator implements PathCalculatorStrategy {
    private static final WalkPathCalculator instance = null;

    @Override
    public void findPath(String source, String destination) {
        System.out.println("Walk route");
    }

    public static WalkPathCalculator getInstance() {
        if (instance == null) {
            synchronized (WalkPathCalculator.class) {
                if (instance == null) {
                    return new WalkPathCalculator();
                }
            }
        }
        return instance;
    }
}
