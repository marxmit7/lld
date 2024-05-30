package spotify.src.com.spotify;

import java.util.Map;
import java.util.HashMap;

public class UserManager{

    private static UserManager instance;
    private static Map<String, User> userMap;

    private UserManager(){};

    public static synchronized UserManager getInstance(){

        if(instance==null) {
            instance = new UserManager();
            userMap = new HashMap<>();
        }

        return instance;
    }

    public User registerUser(User user){

        if(userMap.containsKey(user.getUserId())){
            System.out.println("user is already registered!!");
            return user;
        }

        userMap.put(user.getUserId(), user);

        return user;
    }

    public User authenticate(String userName, String password){

        if(userMap.containsKey(userName)){
            User user = userMap.get(userName);

            if(user.getPassword().equals(password)) 
                return user;
        }

        throw new IllegalArgumentException("User is not registered");

    }

    public boolean isMember(String userName){
        return userMap.containsKey(userName);
    }
    


}