package tinder.src.com.tinder;

public class User{
    private String id;
    private String  name;
    private Integer age;
    private String  email;
    private String  phone;
    private Gender gender;
    private Location location;

    public User(String id, String name, int age, String email, String phone, Gender gender, Location location){
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.phone = phone;
        this.gender = gender;
        this.location = location;
    }

    public String getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public String getEmail(){
        return this.email;
    }

    public String getPhone(){
        return this.phone;
    }

    public Gender getGender(){
        return this.gender;
    }

    public Location getLocation(){
        return this.location;
    }

}