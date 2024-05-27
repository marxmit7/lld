package parking_lot.src.com.parking_lot;

public class ParkingSpot{

    private int spotId;
    private boolean isFree;
    private ParkingSpotType  parkingSpotType;
    private Vehicle vehicle;

    public ParkingSpot(boolean isFree, ParkingSpotType parkingSpotType, int spotId){

        this.parkingSpotType = parkingSpotType;
        this.isFree = isFree;
        this.spotId = spotId;

    }

    public boolean isFree(){
        return this.isFree;
    }

    public void setIsFree(boolean isFree){
        this.isFree=isFree;
    }

    public ParkingSpotType getParkingSpotType(){
        return parkingSpotType;
    }

    public void setVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    public int getSpotId(){
        return this.spotId;
    }

    public void removeVehicle(){
        this.vehicle = null;

    }

    public void makeFree(){
        setIsFree(true);
        removeVehicle();
    }

}