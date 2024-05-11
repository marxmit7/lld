package design_pattern.factory_method;

public class VehicleFactory {
    

    public static Vehicle getVehicle(VehicleType vehicleType){

        switch (vehicleType){
            case MOTORBIKE:
                return new MotorBike();
            case CAR:
                return new Car();
            default:
                throw new IllegalArgumentException("wrong vehicletype given");
        }

    }
}
