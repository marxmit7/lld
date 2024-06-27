package tinder.src.com.tinder;

public class Location {

    private double lattitude;
    private double longitude;

    public Location(double lattitude, double longitude){
        this.lattitude = lattitude;
        this.longitude = longitude;
    }

    public double getLattitude(){
        return this.lattitude;
    }

    public double getLongitude(){
        return this.longitude;
    }

}