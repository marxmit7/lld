package parking_lot.src.com.parking_lot;

import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;

public class ParkingFloor implements Observable{

    private String floorNumber;
    private FloorDisplay floorDisplay;
    private Map<ParkingSpotType, List<ParkingSpot>> parkingSpotMap;
    private List<Observer> observerList;

    public ParkingFloor(String floorNumber, Map<ParkingSpotType,Integer> capacity){
        this.floorNumber = floorNumber;
        this.floorDisplay = new FloorDisplay(floorNumber);

        intializeFloor(capacity);
    }

    private void intializeFloor(Map<ParkingSpotType,Integer> capacity){
        this.parkingSpotMap = new HashMap<>();

        for(Map.Entry<ParkingSpotType, Integer> entry: capacity.entrySet()){
            for(int i=0;i<entry.getValue();i++){
                ParkingSpot parkingSpot = new ParkingSpot(true, entry.getKey(),i);
                this.parkingSpotMap.getOrDefault(entry.getKey(),new ArrayList<ParkingSpot>()).add(parkingSpot);
                this.parkingSpotMap.put(entry.getKey(),this.parkingSpotMap.get(entry.getKey()));       
            }
        }
    }

    @Override
    public void addObserver(Observer observer){
        this.observerList.add(observer);
    }

    @Override 
    public void removeObserver(Observer observer){
        this.observerList.remove(observer);
    }

    @Override 
    public void notifyObserver(){

        for(Observer observer : observerList){
            observer.update(this);
        }

    }
    
}