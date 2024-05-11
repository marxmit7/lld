package design_pattern.factory_method;

public class Car implements Vehicle{

    public Car(){}

    @Override
    public void drive(){
        System.out.println("driving car");
    }
    
}
