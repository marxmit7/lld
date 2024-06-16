package ridemate.src.com.ridemate.data.entities;

public class User{
    private String userId;
    private String userName;
    private String ph;
    private String email;
    private String name;

    public User(String userId, String userName, String ph, String email, String name){
        this.userId = userId;
        this.userName = userName;
        this.ph = ph;
        this.email = email;
        this.name = name;
    }

    public String getUserName(){
        return this.userName;
    }

    public String getName(){
        return this.name;
    }
}