package swiggy.src.com.swiggy;

import java.util.List;

public class Restaurant{
    private String id;
    private String name;
    private Location location;
    private List<MenuItem> items;
    private OpeningHours openingHours;

    public Restaurant(String id, String name, Location location, List<MenuItem> items, OpeningHours openingHours){
        this.id = id;
        this.name = name;
        this.location = location;
        this.items = items;
        this.openingHours = openingHours;
    }

    public String getName(){
        return this.name;
    }

    public Location getLocation(){
        return this.location;
    }

    public List<MenuItem> getMenu(){
        return this.items;
    }

    public OpeningHours getOpeningHours(){
        return this.openingHours;
    }


}