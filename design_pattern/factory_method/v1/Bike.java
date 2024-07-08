package design_pattern.factory_method.v1;

public class Bike implements Vehicle{

    @Override
    public VehicleType getVehicleType(){
        return VehicleType.BIKE;
    }
}