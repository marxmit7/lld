package parking_lot.src.com.parking_lot;

import java.util.Map;
import java.util.HashMap;


public class Main{
    
    public static void main(String[] args){
        System.out.println("Parking lot");

        ParkingLot parkingLot = ParkingLot.getInstance();
        Map<ParkingSpotType,Integer> capacity = new HashMap<>();

        for(ParkingSpotType spotType : ParkingSpotType.values()){
            capacity.put(spotType,20);
        }

        ParkingFloor parkingFloor1 = new ParkingFloor("1", capacity);
        parkingFloor1.addObserver(new FloorDisplay("1"));
        parkingFloor1.notifyObserver();

        EntryPanel entryPanel = new EntryPanel("1");
        ExitPanel exitPanel = new ExitPanel("1");

        parkingLot.addParkingFloor(parkingFloor1);
        parkingLot.addEntryPanel(entryPanel);
        parkingLot.addExitPane(exitPanel);

    }
}