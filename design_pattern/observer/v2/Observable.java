package design_pattern.observer.v2;

public interface Observable{
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyAllObserver();
}