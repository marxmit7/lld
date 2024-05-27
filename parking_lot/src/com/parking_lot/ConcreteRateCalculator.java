package parking_lot.src.com.parking_lot;

public class ConcreteRateCalculator implements RateCalculator {

    @Override 
    public double calculateRate(ParkingSpotType spotType, double min){

        switch (spotType) {
            case TWO_WHEELER:
                return calculate(min, 2.0);
            case EV:
                return calculate(min, 1.5);
            case CAR:
                return calculate(min, 3.0);
            default:
                return calculate(min, 1.0);
        }
    }


    private double calculate(double min, double rate){
        return min*rate ;
    }

}