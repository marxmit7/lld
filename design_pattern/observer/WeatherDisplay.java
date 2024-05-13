package design_pattern.observer;

public class WeatherDisplay implements Observer{
    @Override
    public void update(int temperature){
        System.out.println("temperature has been updated to "+temperature);
    }
}