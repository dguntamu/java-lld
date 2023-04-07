package java8.scaler.designpatterns.observer.publisher;

import java8.scaler.designpatterns.observer.subscribers.OrderPlacedSubscriber;

import java.util.ArrayList;
import java.util.List;

public class Amazon {
    List<OrderPlacedSubscriber> orderPlacedSubscriberList;
    private static Amazon instance = null;

    private Amazon(){
        orderPlacedSubscriberList = new ArrayList<>();
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

    public void orderPlance(){
        orderPlacedSubscriberList.forEach(order -> order.orderPlaceEvent());
    }
}
