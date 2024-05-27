package parking_lot.src.com.parking_lot;

public class FloorDisplay implements Display{

    private String floorNumber;

    public FloorDisplay(String floorNumber){
        this.floorNumber = floorNumber;
    }
    
    @Override
    public void display(){
        System.out.println("FLoor number: "+floorNumber+" "+"display");
    }
}