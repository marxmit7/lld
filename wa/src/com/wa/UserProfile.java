package wa.src.com.wa;

public class UserProfile{
    private String userId;
    private String name;
    private String phone;
    private String profilePicture;


    public void setUserId(String userId){
        this.userId = userId;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public void setProfilePicture(String profilePicture){
        this.profilePicture = profilePicture;
    }

    public String getName(){
        return name;
    }


}