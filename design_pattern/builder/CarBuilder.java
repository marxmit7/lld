package design_pattern.builder;

public interface CarBuilder {

    public CarBuilder addModel(String modelName);
    public CarBuilder addIsEv(boolean isEv);
    public CarBuilder addFuelType(String fuelType);
    public CarBuilder addModelYear(String modelYear);
    public CarBuilder addCompany(String company);

    public Car build();
}