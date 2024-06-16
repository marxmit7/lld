package ridemate.src.com.ridemate.services;

import ridemate.src.com.ridemate.data.entities.*;
import ridemate.src.com.ridemate.matching.MatchingAlgorithm;

public class MatchingService{
    private MatchingAlgorithm matchingAlgorithm;

    public MatchingService(MatchingAlgorithm matchingAlgorithm){
        this.matchingAlgorithm = matchingAlgorithm;
    }

    public Match findMatch(RideRequest rideRequestA, RideRequest rideRequestB){

        return this.matchingAlgorithm.findMatch(rideRequestA, rideRequestB);
    }
}