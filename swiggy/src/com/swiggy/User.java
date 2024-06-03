package swiggy.src.com.swiggy;

import java.util.List;
import java.util.Arrays;

public class User {
    private String userId;
    private String name;
    private String ph;
    private String email;
    private List<Location> locations;

    public User(String id, String name, String ph, String email, Location location){
        this.userId = id;
        this.name = name;
        this.ph = ph;
        this.email = email;
        this.locations = Arrays.asList(location);
    }

    public String getName(){
        return this.name;
    }

    public String getPhone(){
        return this.ph;
    }
    public String getEmail(){
        return this.email;
    }
    public List<Location> getLocations(){
        return this.locations;
    }
}