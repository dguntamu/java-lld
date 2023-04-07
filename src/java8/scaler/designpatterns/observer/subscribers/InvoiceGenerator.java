package java8.scaler.designpatterns.observer.subscribers;

import java8.scaler.designpatterns.observer.pojo.ReturnData;
import java8.scaler.designpatterns.observer.publisher.Amazon;

public class InvoiceGenerator implements OrderPlacedSubscriber{

    public InvoiceGenerator(){
        Amazon amazon = Amazon.getInstance();
        amazon.registerSubscriber(this);
    }
    @Override
    public ReturnData orderPlaceEvent() {
        System.out.println("Invoice is beeing generated");
        return new ReturnData("Invoice is beeing generated");
    }
}
