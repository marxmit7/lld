package ridemate.src.com.ridemate.services;

import ridemate.src.com.ridemate.User.UserManager;
import ridemate.src.com.ridemate.data.entities.User;

public class UserService {
    private UserManager userManager;

    public UserService(){
        userManager = UserManager.getInstance();
    }

    public void register(User user) throws Exception{
        userManager.register(user);
    }

    public boolean login(User user){
        return userManager.login(user);
    }
    
}
