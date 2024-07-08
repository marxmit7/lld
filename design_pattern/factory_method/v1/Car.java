package design_pattern.factory_method.v1;

public class Car implements Vehicle{

    @Override
    public VehicleType getVehicleType(){
        return VehicleType.CAR;
    }

}