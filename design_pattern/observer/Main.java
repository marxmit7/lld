package design_pattern.observer;

public class Main{
    public static void main(String[] args){

        WeatherStation weatherStation = new WeatherStation();
        WeatherDisplay weatherDisplay1 = new WeatherDisplay();
        WeatherDisplay weatherDisplay2 = new WeatherDisplay();

        weatherStation.registerObserver(weatherDisplay1);
        weatherStation.registerObserver(weatherDisplay2);

        weatherStation.setTemperature(5);
        
    }
}