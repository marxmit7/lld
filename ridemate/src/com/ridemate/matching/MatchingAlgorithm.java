package ridemate.src.com.ridemate.matching;

import ridemate.src.com.ridemate.data.entities.*;

public interface MatchingAlgorithm{
    Match findMatch(RideRequest rideRequestA, RideRequest rideRequestB);
}