package java8.scaler.designpatterns.stategy;

public class Maps {
    public void findPath(String source, String destination, TypeOfModeEnum mode){
        PathCalculatorStrategy pathCalculator = PathCalculatorFactory.getPathCalculator(mode);
        pathCalculator.findPath(source, destination);
    }
}