package parking_lot.src.com.parking_lot;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class ParkingLot{
    private static ParkingLot instance;

    private Map<String,ParkingFloor> parkingFloor;
    private List<EntryPanel> entryPoints;
    private List<ExitPanel> exitPoints;

    private ParkingLot(){
        this.parkingFloor = new HashMap<>();
        this.entryPoints = new ArrayList<>();
        this.exitPoints = new ArrayList<>();
       
    }

    public synchronized static ParkingLot getInstance(){
        if(instance==null){
            instance = new ParkingLot();
        }
        return instance;
    }

    public void addParkingFloor(ParkingFloor parkingFloor){
        this.parkingFloor.put(parkingFloor.getFloorNumber(), parkingFloor);
    }

    public void addEntryPanel(EntryPanel entryPanel){
        this.entryPoints.add(entryPanel);
    }

    public void removeEntryPanel(EntryPanel entryPanel){
        this.entryPoints.remove(entryPanel);
    }

    public void addExitPane(ExitPanel exitPanel){
        this.exitPoints.add(exitPanel);
    }

}