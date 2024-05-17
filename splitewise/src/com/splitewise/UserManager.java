package splitewise.src.com.splitewise;

import java.util.HashMap;

public class UserManager{
    
    private HashMap<String,User> userMap;
    private static UserManager instance;

    private UserManager(){
        this.userMap = new HashMap<>();
    }

    public static synchronized UserManager getInstance(){
        if(instance == null) 
            instance = new UserManager();
        return instance;
    }

    public void addUser(User user){
        this.userMap.put(user.getUserId(),user);
    }

    public void removeUser(String userId){
        this.userMap.remove(userId);
    }

    public User getUser(String userId){
        return this.userMap.getOrDefault(userId, null);
    }
}