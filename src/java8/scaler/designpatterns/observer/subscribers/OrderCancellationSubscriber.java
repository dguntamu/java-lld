package java8.scaler.designpatterns.observer.subscribers;

import java8.scaler.designpatterns.observer.pojo.ReturnData;

public interface OrderCancellationSubscriber {
    ReturnData cancelOrder();
}
