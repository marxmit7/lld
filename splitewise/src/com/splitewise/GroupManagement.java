package splitewise.src.com.splitewise;

import java.util.HashMap;
import java.util.List;

public class GroupManagement{

    private static HashMap<String, List<User>> groups = new HashMap<>();

    private static GroupManagement groupManagement;


    private GroupManagement(){}

    public static synchronized GroupManagement getInstance(){
        if(groupManagement == null) {
            groupManagement = new GroupManagement();
        }
        return groupManagement;
    }

}