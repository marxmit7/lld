package ridemate.src.com.ridemate.data.entities;

import javafx.util.Pair;

public class Match {

    Pair<RideRequest, RideRequest> match;

    public Match(RideRequest rideRequestA, RideRequest rideRequestB){
        this.match =  new Pair<>(rideRequestA, rideRequestB);
    }

    public  Pair<RideRequest, RideRequest> getMatch(){
        return match;
    }

    @Override
    public String toString(){
        return "user "+ this.getMatch().getKey().getUser().getName() +" is matched with user " + this.getMatch().getValue().getUser().getName();
    }

}