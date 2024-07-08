package design_pattern.factory_method.v1;

public class Main{
    public static void main(String args[]){

        Vehicle car =  VehicleFactory.getVehicle(VehicleType.CAR);
        Vehicle truck = (Truck) VehicleFactory.getVehicle(VehicleType.TRUCK);

        System.out.println(car.getVehicleType());
    }
}