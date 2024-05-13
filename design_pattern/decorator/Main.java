package design_pattern.decorator;

public class Main{

    public static void main(String[] args){

        Beverage coffee = new Coffee();
       Beverage milkedCoffe = new MilkDecorator(coffee);
        Beverage sugarMilkedCoffe = new SugarDecorator(milkedCoffe);

        System.out.println("Beverage desc: "+sugarMilkedCoffe.getDescription());
        System.out.println("Beverage cost: "+sugarMilkedCoffe.getCost());

    }
}