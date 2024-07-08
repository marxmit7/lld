package design_pattern.factory_method.v1;

public class VehicleFactory{

    public static Vehicle getVehicle(VehicleType vehicleType){

        switch (vehicleType) {
            case BIKE:
                return new Bike();
            case CAR:
                return new Car();
            case TRUCK:
                return new Truck();        
            default:
                throw new IllegalArgumentException("No such vehicle exists");
        }

    }
}