package wa.src.com.wa;

public class UserProfileBuilder{

    private UserProfile userProfile;

    public UserProfileBuilder(){
        this.userProfile = new UserProfile();
    }

    public static UserProfileBuilder builder(){
         return new UserProfileBuilder();

    }


    public UserProfileBuilder addName(String name){

        this.userProfile.setName(name);
        return this;

    }
    public UserProfileBuilder addPhone(String phone){
        this.userProfile.setPhone(phone);
        return this;


    }
    public UserProfileBuilder addProfilePicture(String profilePicutre){
        this.userProfile.setProfilePicture(profilePicutre);
        return this;


    }
    public UserProfileBuilder addUserId(String userId){
        this.userProfile.setUserId(userId);
        return this;


    }

    public UserProfile build(){
        return userProfile;

    }

}