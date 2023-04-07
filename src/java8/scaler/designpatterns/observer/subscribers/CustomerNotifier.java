package java8.scaler.designpatterns.observer.subscribers;

import java8.scaler.designpatterns.observer.pojo.ReturnData;
import java8.scaler.designpatterns.observer.publisher.Amazon;

public class CustomerNotifier implements OrderPlacedSubscriber,OrderCancellationSubscriber {

    public CustomerNotifier(){
        Amazon amazon = Amazon.getInstance();
        amazon.registerSubscriber(this);
        //amazon.orderCancelUnSubscriber(this);
    }
    @Override
    public ReturnData orderPlaceEvent() {
        System.out.println("Notify all the customers");
        return new ReturnData("Notify all the customers");
    }

    @Override
    public ReturnData cancelOrder() {
        System.out.println("Order has been cancelled");
        return new ReturnData("Order has been cancelled");
    }
}
