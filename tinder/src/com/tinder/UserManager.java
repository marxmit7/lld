package tinder.src.com.tinder;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UserManager {

    private static UserManager instance;
    private static Map<String, User> userMap;
    private static Map<Gender, Set<User>> genderUserMap;

    private UserManager() {
    };

    public UserManager getInstance() {
        if (instance == null) {
            synchronized (UserManager.class) {
                instance = new UserManager();
                userMap = new HashMap<>();
                genderUserMap = new HashMap<Gender,Set<User>>() {
                    {
                        put(Gender.MALE, new HashSet<User>());
                        put(Gender.FEMALE, new HashSet<User>());
                    }
                };
            }
        }
        return instance;
    }
    

    public boolean register(User user) {
        if (!userMap.containsKey(user.getId())) {
            userMap.put(user.getId(), user);

            if (Gender.FEMALE.equals(user.getGender())) {
                genderUserMap.put(Gender.FEMALE, genderUserMap.get(Gender.FEMALE).add(user));
            } else {
                genderUserMap.put(Gender.MALE, genderUserMap.get(Gender.FEMALE).add(user));
            }
            return true;
        } else {
            return false;
        }
    }


    public boolean remove(User user) {
        if (!userMap.containsKey(user.getId())) {
            return false;
        } else {
            userMap.remove(user.getId());

            if (Gender.FEMALE.equals(user.getGender())) {
                genderUserMap.put(Gender.FEMALE, genderUserMap.get(Gender.FEMALE).remove(user));
            } else {
                genderUserMap.put(Gender.MALE, genderUserMap.get(Gender.FEMALE).remove(user));
            }

            return true;
        }
    }
}