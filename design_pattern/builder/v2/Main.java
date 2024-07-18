package design_pattern.builder.v2;

public class Main{
    public static void main(String[] args){
        MargheritaBuilder margheritaBuilder = new MargheritaBuilder();
        margheritaBuilder.setCheese(true).setDough("flour").setSauce("tomato");
        Margherita margheritaPizza = margheritaBuilder.build();
        
    }
}