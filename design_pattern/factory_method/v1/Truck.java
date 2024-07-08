package design_pattern.factory_method.v1;

public class Truck implements Vehicle{

    @Override
    public VehicleType getVehicleType(){
        return VehicleType.TRUCK;
    }

}