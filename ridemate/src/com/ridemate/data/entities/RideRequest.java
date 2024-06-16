package ridemate.src.com.ridemate.data.entities;

public class RideRequest {

    private String requestId;
    private User user;
    private Location source;
    private Location desitnation;

    public RideRequest(Location source, Location desitnation, User user){
        this.source = source;
        this.desitnation = desitnation;
        this.user = user;
    }

    public Location getSource(){
        return source;
    }
    public Location getDestination(){
        return desitnation;
    }

    public User getUser(){
        return user;
    }

    @Override
    public String toString(){
        return "source lat: "+source.getLattitude() +" source long: "+source.getLongitude() + "desti lat: "+desitnation.getLattitude() +" desti long: "+desitnation.getLongitude();
        
    }


}