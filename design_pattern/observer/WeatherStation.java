package design_pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{
    private List<Observer> observerList;
    private int temp;

    public WeatherStation(){
        this.observerList = new ArrayList<>();
    }

    public void setTemperature(int temp){
        this.temp = temp;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer){
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer){
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers(){
        for(Observer observer: observerList){
            observer.update(temp);
        }
    }

}