package spotify.src.com.spotify;

public class User{

    private String userId;
    private String firstName;
    private String lastName;
    private String email;
    private String ph;
    private String password;

    public User(String userId, String firstName, String lastName, String email, String ph, String password ){
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.ph = ph;
        this.password = password;
    }

    public String getFirstName(){
        return this.firstName;
    }
    public String getUserId(){
        return this.userId;
    }
    public String getEmail(){
        return this.email;
    }
    public String getPhone(){
        return this.ph;
    }
    public String getPassword(){
        return this.password;
    }

}