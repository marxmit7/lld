package com.bookmyshow.services;

import java.util.List;
import com.bookmyshow.models.Movie;
import com.bookmyshow.models.Show;
import com.bookmyshow.models.Customer;
import java.util.ArrayList;
public class TicketBookingService {
    
    public List<Movie> searchMovies(String name){

        return new ArrayList<>();
    }
    public List<Show> getAvailableShows(String name, String city){

        return new ArrayList<>();
    }
    public boolean bookTicket(Customer customer, Show show){
        return true;
    }
}
