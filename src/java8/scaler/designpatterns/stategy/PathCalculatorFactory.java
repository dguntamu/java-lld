package java8.scaler.designpatterns.stategy;

public class PathCalculatorFactory {
    public static PathCalculatorStrategy getPathCalculator(TypeOfModeEnum mode) {
        PathCalculatorStrategy strategyObj = null;
        switch (mode) {
            case CAR:
                strategyObj = CarPathCalculator.getInstance();
                break;
            case BIKE:
                strategyObj = BikePathCalculator.getInstance();
                break;

            case WALK:
                strategyObj = WalkPathCalculator.getInstance();
                break;
        }
        return strategyObj;
    }
}
