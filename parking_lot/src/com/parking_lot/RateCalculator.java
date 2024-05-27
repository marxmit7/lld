package parking_lot.src.com.parking_lot;

public interface RateCalculator {

    public double calculateRate(ParkingSpotType spotType, double min);

}