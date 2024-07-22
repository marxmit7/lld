package design_pattern.observer.v2;
import java.util.*;

public class Station implements Observable{
    private List<Observer> observerList = new ArrayList<>();
    private String message;


    public Station(){

    }
    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
        this.notifyAllObserver();
    }


    @Override
    public void addObserver(Observer observer){
        this.observerList.add(observer);
    }

    public void addObserver(List<Observer> observerList){
        this.observerList=observerList;
    }


    @Override
    public void removeObserver(Observer observer){
        if(this.observerList.contains(observer))
            this.observerList.remove(observer);
    }

    @Override
    public void notifyAllObserver(){
       
        for(Observer observer: observerList){
            observer.update(getMessage());
        }
    }

}