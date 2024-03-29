package java8.scaler.designpatterns.observer;

import java8.scaler.designpatterns.observer.publisher.Amazon;
import java8.scaler.designpatterns.observer.subscribers.CustomerNotifier;
import java8.scaler.designpatterns.observer.subscribers.InvoiceGenerator;
import java8.scaler.designpatterns.observer.subscribers.WareHouseManagementNotifier;

public class Client {
    public static void main(String[] args) {
        Amazon amazon = Amazon.getInstance(); //Publisher

        //Creating the subscriber and auto-subscribing via constructor
        //amazon.registerSubscriber(this); this is merged in the constructor
        CustomerNotifier customerNotifier = new CustomerNotifier();
        WareHouseManagementNotifier wareHouseManagementNotifier = new WareHouseManagementNotifier();
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();

        //amazon.orderPlance();
        amazon.orderCancelSubscriber(customerNotifier);
        amazon.orderCancelSubscribers();
        amazon.orderCancelUnSubscriber(customerNotifier);


        System.out.println("==========");
        amazon.orderCancelSubscribers();
        //de-register/unsubscribe the subscriber.
        amazon.deRegisterSubscriber(customerNotifier);
        //amazon.orderPlance();
    }
}
