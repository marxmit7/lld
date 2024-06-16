package ridemate.src.com.ridemate.data.entities;

public class RideRequest {

    private String requestId;
    private Location source;
    private Location desitnation;

    public RideRequest(Location source, Location desitnation){
        this.source = source;
        this.desitnation = desitnation;
    }


}