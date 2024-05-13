package design_pattern.observer;

public interface Subject{
    public void registerObserver(Observer bserver);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}