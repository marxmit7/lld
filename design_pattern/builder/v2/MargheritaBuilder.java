package design_pattern.builder.v2;

public class MargheritaBuilder implements PizzaBuilder{
    private String sauce;
    private String dough;
    private boolean cheese;


    @Override
    public MargheritaBuilder setSauce(String sauce){
        this.sauce = sauce;
        return this;
    }

    @Override
    public  MargheritaBuilder setDough(String dough){
        this.dough = dough;
        return this;
    }

    @Override
    public  MargheritaBuilder setCheese(boolean cheese){
        this.cheese = cheese;
        return this;
    }

    public Margherita build(){
        return new Margherita(this.dough, this.sauce,this.cheese);
    }
    public  MargheritaBuilder builder(){
        return this;
    }
}