package parking_lot.src.com.parking_lot;

public interface Observable{

    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();


}