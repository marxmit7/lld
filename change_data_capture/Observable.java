package bs;

public interface Observable{
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyAllObserver(String updates);
}