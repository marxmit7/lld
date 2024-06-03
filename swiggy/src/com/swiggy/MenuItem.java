package swiggy.src.com.swiggy;

import java.util.Set;

public class MenuItem{

    private String id;
    private String name;
    private String description;
    private FoodType foodType;
    private Set<String> tags;
    private double rating;

    public MenuItem(String id, String name, String desc, FoodType foodType, Set<String> tags ){
        this.id = id;
        this.name = name;
        this.description = desc;
        this.foodType = foodType;
        this.tags = tags;
    }

    public String getName(){
        return this.name;
    }
    public String getDescription(){
        return this.description;
    }
    public FoodType getFoodType(){
        return this.foodType;
    }

    public Set<String>  getTags(){
        return this.tags;
    }
    public void setRating(double rating){
        this.rating = rating;
    }


}