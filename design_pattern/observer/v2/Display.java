package design_pattern.observer.v2;

public class Display implements Observer{

    private String displayId;
    public Display(String displayId){
        this.displayId=displayId;
    }

    @Override
    public void update(String message){
        System.out.println("displayId: "+displayId+ "  message: "+message);

    }
}