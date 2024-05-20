package splitewise.src.com.splitewise;

import java.util.UUID;

public class User {

    private String name;
    private String userId;

    public User(String name){
        this.name = name;
        this.userId = UUID.randomUUID().toString();
    }

    public String getUserId(){
        return this.userId;
    }
}