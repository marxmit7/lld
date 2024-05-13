package design_pattern.decorator;

public class Coffee implements Beverage{

    @Override
    public String getDescription(){
        return "Coffee";
    }

    @Override
    public double getCost(){
        return 2.0;
    }
}