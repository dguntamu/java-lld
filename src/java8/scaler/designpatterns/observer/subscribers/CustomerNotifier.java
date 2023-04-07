package java8.scaler.designpatterns.observer.subscribers;

import java8.scaler.designpatterns.observer.pojo.ReturnData;
import java8.scaler.designpatterns.observer.publisher.Amazon;

public class CustomerNotifier implements OrderPlacedSubscriber {

    public CustomerNotifier(){
        Amazon amazon = Amazon.getInstance();
        amazon.registerSubscriber(this);
    }
    @Override
    public ReturnData orderPlaceEvent() {
        System.out.println("Notify all the customers");
        return new ReturnData("Notify all the customers");
    }
}
