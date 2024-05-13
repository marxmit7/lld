package design_pattern.decorator;

public class SugarDecorator extends BeverageDecorator{

    public SugarDecorator(Beverage beverage){
        super(beverage);
    }

    @Override
    public String getDescription(){
        return beverage.getDescription() + ", Sugar";
    }

    @Override
    public double getCost(){
        return beverage.getCost() +0.8;
    }
}