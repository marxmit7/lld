package authenticator.src.com.authenticator;

public class User{
    private String userName;
    private String password;
    private String updatedAt;
    private String email;
    private String ph;

    public User(String userName, String password, String ph , String email){
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.ph = ph;
    }

    public String getUserName(){
        return this.userName;
    }
    public String getPassword(){
        return this.password;
    }

    public String getEmail(){
        return this.email;
    }

    public String getPhone(){
        return this.ph;
    }
}