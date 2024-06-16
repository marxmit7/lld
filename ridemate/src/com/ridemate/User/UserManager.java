package ridemate.src.com.ridemate.User;

import java.util.*;
import ridemate.src.com.ridemate.data.entities.*;
public class UserManager {

    private static UserManager instance;
    private static Map<String, User> userMap;

    private UserManager(){};

    public static UserManager getInstance(){
        if(instance == null ){
            synchronized(UserManager.class){
                instance = new UserManager();
                userMap = new HashMap<>();
            }
        }
        return instance;
    }

    public void register(User user) throws Exception{
        if(!userMap.containsKey(user.getUserName())){
            userMap.put(user.getUserName(),user);
        } else {
            throw new Exception("User is already registered");
        }
    }

    public boolean login(User user){
        if(!userMap.containsKey(user.getUserName())){
            return false;
        } else return true;
    }

    public List<User> getAllRegisteredUser(){
        return (List<User>) userMap.values();
    }

    public User getRegisteredUserById(String userId ){
        return userMap.get(userId);
    }
}
