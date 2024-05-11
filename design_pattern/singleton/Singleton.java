

public class Singleton{

    private static Singleton singleton ;

    private Singleton(){};


    public static  Singleton getInstance(){

        if(singleton==null){
            synchronized(Singleton.class){ // double-checked locking
                if(singleton==null)
                singleton = new Singleton();
            }; 
            
        } 

        return singleton;
    }
}