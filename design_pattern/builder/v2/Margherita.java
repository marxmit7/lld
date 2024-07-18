package design_pattern.builder.v2;

public class Margherita implements Pizza{

    private String dough;
    private String sauce;
    private boolean cheese;

    public Margherita(String dough, String sauce, boolean cheese){
        this.dough = dough;
        this.sauce = sauce;
        this.cheese = cheese;
    }


}