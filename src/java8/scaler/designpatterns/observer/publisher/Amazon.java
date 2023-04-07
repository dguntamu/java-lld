package java8.scaler.designpatterns.observer.publisher;

import java8.scaler.designpatterns.observer.subscribers.OrderCancellationSubscriber;
import java8.scaler.designpatterns.observer.subscribers.OrderPlacedSubscriber;

import java.util.ArrayList;
import java.util.List;

public class Amazon {
    //publisher obj holding the list of subscribers in orderPlacedSubscriberList
    List<OrderPlacedSubscriber> orderPlacedSubscriberList;

    List<OrderCancellationSubscriber> orderCancellationSubscribers;
    private static Amazon instance = null;

    private Amazon(){
        orderPlacedSubscriberList = new ArrayList<>();
        orderCancellationSubscribers = new ArrayList<>();
    }
    public static Amazon getInstance(){
        if(instance == null){
            synchronized (Amazon.class){
                if(instance == null){
                    instance = new Amazon();
                }
            }
        }
        return instance;
    }

    public void registerSubscriber(OrderPlacedSubscriber orderPlacedSubscriber){
        this.orderPlacedSubscriberList.add(orderPlacedSubscriber);
    }

    public void deRegisterSubscriber(OrderPlacedSubscriber orderPlacedSubscriber){
        this.orderPlacedSubscriberList.remove(orderPlacedSubscriber);
    }

    public void orderCancelSubscriber(OrderCancellationSubscriber orderCancellationSubscriber){
        this.orderCancellationSubscribers.add(orderCancellationSubscriber);
    }

    public void orderCancelUnSubscriber(OrderCancellationSubscriber orderCancellationUnSubscriber){
        this.orderCancellationSubscribers.remove(orderCancellationUnSubscriber);
    }

    /*
    - Made Amazon as a singleton because of below reason:
    -> There is a problem for every subscriber we are creating a new Amazon obj,
        so stopping to have multiple objs we are creating Amazon as singletone.
    1.) Amazon a1 in CustomerNotifier constructor as below.
            public CustomerNotifer(){
            Amazon a1 = new Amazon();
            a1.registerSubscriber(this);
           }
    2.) Amazon a2 in WareHouseManagementNotifier constructor as below.
            public WareHouseManagementNotifier(){
            Amazon a2 = new Amazon();
            a2.registerSubscriber(this);
           }
     3.) Amazon a1 in InvoiceGenerator constructor as below.
            public InvoiceGenerator(){
            Amazon a3 = new Amazon();
            a3.registerSubscriber(this);
           }
      Note:
      Because of above 3 points orderPlacedSubscriberList will be scattered for each subscriber,
      we need single list to hold all subscribers.
     */
    public void orderPlance(){
        /*
        - Without observre patter we used to call as below.
        - customerNotify.notify()
        - whmsNotifier.update()
        - invoiceGenerator.generate() etc..
        Note: here the problem, we need to make code changes - build etc if we add/remove any method.
         */

        /*
        But with the Observer DPatter, adding/removing happend at runtime.
        orderPlacedSubscriberList: who all are part of this list will be notified.
         */

        orderPlacedSubscriberList.forEach(order -> order.orderPlaceEvent());
    }

    public void orderCancelSubscribers(){
        orderCancellationSubscribers.forEach(order -> order.cancelOrder());
    }
}
