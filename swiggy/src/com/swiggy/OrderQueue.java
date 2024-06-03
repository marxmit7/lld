package swiggy.src.com.swiggy;

import java.util.HashMap;
import java.util.Map;

public class OrderQueue{
    private static OrderQueue instance;
    private static Map<String, Order> restaurantOrderQueueMap;

    private OrderQueue(){}

    public OrderQueue getInstance(){
        if(instance == null) {
            instance = new OrderQueue();
            restaurantOrderQueueMap = new HashMap<>();
        }
        return instance;
    }
}