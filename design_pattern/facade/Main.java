package design_pattern.facade;

public class Main{
    public static void main(String[] args){

        Amplifier amplifier = new Amplifier();
        TV tv = new TV();
        Woofer woofer = new Woofer();
        DVDPlayer dvdPlayer = new DVDPlayer();
        
        HomeTheatreFacade homeTheatreFacade = new HomeTheatreFacade(amplifier, tv, dvdPlayer, woofer);

        homeTheatreFacade.watchMovie();
    }
}