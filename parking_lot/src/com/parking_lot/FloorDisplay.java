package parking_lot.src.com.parking_lot;

import java.util.Map;
import java.util.HashMap;

public class FloorDisplay implements Display, Observer {

    private String floorNumber;
    private Map<ParkingSpotType, Integer> availableSpots;

    public FloorDisplay(String floorNumber){
        this.floorNumber = floorNumber;
        this.availableSpots = new HashMap<>();
    }
    
    @Override
    public void display(){
        System.out.println("FLoor number: "+floorNumber+" "+"Display");

        for(Map.Entry<ParkingSpotType, Integer> entry: availableSpots.entrySet()){
            System.out.println(entry.getKey()+" available spots: "+entry.getValue());
        }

    }

    @Override 
    public void update(ParkingFloor parkingFloor){

        for(ParkingSpotType key: ParkingSpotType.values()){
            this.availableSpots.put(key, parkingFloor.getFreeSpots(key));
        }
        display();
    }
}