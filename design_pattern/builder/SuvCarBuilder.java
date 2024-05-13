package design_pattern.builder;

public class SuvCarBuilder implements CarBuilder
{
    private Car car; 
    public SuvCarBuilder(){
        this.car = new Car();
    }

    public static SuvCarBuilder builder(){

        return new SuvCarBuilder();
    }
    @Override
    public CarBuilder addModel(String modelName){
        this.car.setModel(modelName);
        return this;
    }
    @Override
    public CarBuilder addIsEv(boolean isEv){
        this.car.setEv(isEv);
        return this;
    }
    @Override
    public CarBuilder addFuelType(String fuelType){
        this.car.setFuelType(fuelType);
        return this;
    }
    @Override
    public CarBuilder addModelYear(String modelYear){
        this.car.setModelYear(modelYear);
        return this;
    }
    @Override
    public CarBuilder addCompany(String company){
        this.car.setCompany(company);
        return this;
    }

    @Override
    public Car build(){
        return this.car;
    }
}