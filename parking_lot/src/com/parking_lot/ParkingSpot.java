package parking_lot.src.com.parking_lot;

public class ParkingSpot{

    private int spotId;
    private boolean isFree;
    private ParkingSpotType  parkingSpotType;

    public ParkingSpot(boolean isFree, ParkingSpotType parkingSpotType, int spotId){

        this.parkingSpotType = parkingSpotType;
        this.isFree = isFree;
        this.spotId = spotId;

    }
}