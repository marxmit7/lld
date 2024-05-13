package design_pattern.adapter;

public class UsSocketAdapter implements EuSocket{
    private UsSocket usPlug;

    public UsSocketAdapter(UsSocket usPlug){
        this.usPlug = usPlug;
    }

    @Override
    public void plugin(){

        System.out.println("converting us plug to eu plug");
        usPlug.plugin();
        System.out.println("converted us plug to eu plug");

    }

}