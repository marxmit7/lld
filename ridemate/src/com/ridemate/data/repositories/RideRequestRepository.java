package ridemate.src.com.ridemate.data.repositories;

import ridemate.src.com.ridemate.data.entities.*;
import java.util.*;

public interface RideRequestRepository {

    void save(RideRequest rideRequest);
    RideRequest findById(String requestId);
    List<RideRequest> findAll();

}