package design_pattern.factory_method;

public class MotorBike implements Vehicle{ 
    
    public MotorBike (){};

    @Override
    public void drive(){
        System.out.println("riding bike");
    }
    
}
