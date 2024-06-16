package ridemate.src.com.ridemate.data.entities;

public class Location {
    private Double lattitude;
    private Double longitude;

    public Location(Double lattitude, Double longitude){
        this.lattitude = lattitude;
        this.longitude = longitude;
    }

    public Double getLattitude(){
        return this.lattitude;
    }
    public Double getLongitude(){
        return this.longitude;
    }

    public double distanceTo(Location other){
        double xDistance = other.getLattitude() -  this.getLattitude();
        double yDistance = other.getLongitude() - this.getLongitude();
        return Math.sqrt(xDistance*xDistance + yDistance*yDistance);
        
    }

    
    
}
