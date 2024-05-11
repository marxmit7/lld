package design_pattern.factory_method;


public class Main {

    public static void main(String[] args){
        System.out.println("factory design pattern");

        VehicleFactory vehicleFactory = new VehicleFactory();

        Vehicle vehicle1 = vehicleFactory.getVehicle(VehicleType.CAR);
        Vehicle vehicle2 = vehicleFactory.getVehicle(VehicleType.MOTORBIKE);

        vehicle1.drive();
        vehicle2.drive();
        
    }
    
}
