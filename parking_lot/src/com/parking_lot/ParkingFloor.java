package parking_lot.src.com.parking_lot;

import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;

public class ParkingFloor implements Observable{

    private String floorNumber;
    private Map<ParkingSpotType, List<ParkingSpot>> parkingSpotMap;
    private List<Observer> observerList;

    public ParkingFloor(String floorNumber, Map<ParkingSpotType,Integer> capacity){
        this.floorNumber = floorNumber;
        this.observerList = new ArrayList<>();
        intializeFloor(capacity);
    }

    private void intializeFloor(Map<ParkingSpotType,Integer> capacity){
        this.parkingSpotMap = new HashMap<>();

        for(Map.Entry<ParkingSpotType, Integer> entry: capacity.entrySet()){
            for(int i=0;i<entry.getValue();i++){
                ParkingSpot parkingSpot = new ParkingSpot(true, entry.getKey(),i);
                List<ParkingSpot> parkingSpotsList= this.parkingSpotMap.getOrDefault(entry.getKey(),new ArrayList<>());
                parkingSpotsList.add(parkingSpot);
                this.parkingSpotMap.put(entry.getKey(),parkingSpotsList);       
            }
        }
        notifyObserver();

    }
    public String getFloorNumber(){
        return this.floorNumber;
    }

    public synchronized boolean parkVehicle(Vehicle vehicle, ParkingSpotType parkingSpotType){

        for(ParkingSpot parkingSpot: this.parkingSpotMap.getOrDefault(parkingSpotType,new ArrayList<>())){
            if(parkingSpot.getParkingSpotType()==parkingSpotType && parkingSpot.isFree()){
                parkingSpot.setIsFree(false);
                parkingSpot.setVehicle(vehicle);
                notifyObserver();
                return true;
            }
        }
        return false;
    }

    public synchronized boolean freeSpot(int spotId){

        for(List<ParkingSpot> parkingSpotList: parkingSpotMap.values()){
            for(ParkingSpot parkingSpot: parkingSpotList){
                if(parkingSpot.getSpotId()==spotId){
                    parkingSpot.makeFree();
                    notifyObserver();
                    return true;
                }
            }
        }
        return false;
    }


    protected synchronized int getFreeSpots(ParkingSpotType parkingSpotType){

        int count = 0;
        for(ParkingSpot parkingSpot: parkingSpotMap.getOrDefault(parkingSpotType, new ArrayList<>())){
            if(parkingSpot.isFree())count++;
        }
        return count;
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
        for(Observer observer : this.observerList){
            observer.update(this);
        }
    }
    
}