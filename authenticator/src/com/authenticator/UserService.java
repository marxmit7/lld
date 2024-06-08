package authenticator.src.com.authenticator;

import java.util.*;

public class UserService{
    private static UserService instance;
    private static Map<String, User> userMap;

    private UserService(){}

    public static synchronized UserService getInstance(){
        if(instance==null){
            instance = new UserService();
            userMap = new HashMap<>();
        }

        return instance;
    }

    public void registerUser(String userName, String password) throws Exception{

        if(!userMap.containsKey(userName)){
            userMap.put(userName, new User(userName, password, "email", "ph"));
        } else {
            throw new Exception("user already registered");
        }

    }

    public boolean loginUser(String userName, String password) throws Exception{

        if(userMap.containsKey(userName)){
           if(userMap.get(userName).getPassword().equals(password)){
                return true;
           }
           else 
            return false;
        } else {
            throw new Exception("user not registered");
        }
    }
}