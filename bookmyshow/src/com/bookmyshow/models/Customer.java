package com.bookmyshow.models;

import java.util.List;

public class Customer extends Person{

    private List<Booking> bookings;

    private boolean makeBooking(Booking booking){
        // write the logic to book the ticket 
        return true;
    };
    
}
