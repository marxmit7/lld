package design_pattern.builder;

public class Main{
    public static void main(String[] args){
        SuvCarBuilder suvBuilder = SuvCarBuilder.builder();

        suvBuilder.addCompany("tesla");
        suvBuilder.addIsEv(true);
        suvBuilder.addModel("2024");
        suvBuilder.addModel("plaid");

        Car newCar = suvBuilder.build();

        System.out.println(newCar.getCompany());
    }
}