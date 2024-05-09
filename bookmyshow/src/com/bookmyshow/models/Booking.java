package com.bookmyshow.models;

import java.util.List;

import com.bookmyshow.enums.PaymentMethodType;

public class Booking {
    
    private Show show;
    private List<Seat> bookedSeats;
    private PaymentMethodType paymentMethodType;
    private Double totalPrice;

}
