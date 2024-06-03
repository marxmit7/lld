package swiggy.src.com.swiggy;

import java.util.List;

public class Order{
    private String orderId;
    private User user;
    private Restaurant restaurant;
    private double price;
    private List<MenuItem> items;
    private Location pickUpLocation;
    private Location dropLocation;
    private OrderStatus orderStatus;

    public Order(String orderId, User user, Restaurant restaurant, Double price, List<MenuItem> items, Location pickLocation, Location dropLocation){
        this.orderId = orderId;
        this.user = user;
        this.restaurant = restaurant;
        this.price = price;
        this.items = items;
        this.pickUpLocation = pickUpLocation;
        this.dropLocation = dropLocation;
    }


}