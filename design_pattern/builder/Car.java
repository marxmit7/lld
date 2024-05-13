package design_pattern.builder;

public class Car{
    private String model;
    private boolean isEv;
    private String fuelType;
    private String modelYear;
    private String company;

    public void setModel(String model) {
        this.model = model;
    }
    public void setEv(boolean isEv) {
        this.isEv = isEv;
    }
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
    public void setModelYear(String modelYear) {
        this.modelYear = modelYear;
    }
    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public boolean isEv() {
        return isEv;
    }

    public String getFuelType() {
        return fuelType;
    }

    public String getModelYear() {
        return modelYear;
    }

    public String getCompany() {
        return company;
    }

}