package design_pattern.facade;

public class HomeTheatreFacade{
    private Amplifier amplifier;
    private TV tv;
    private DVDPlayer dvdPlayer;
    private Woofer woofer;

    public HomeTheatreFacade(Amplifier amplifier, TV tv, DVDPlayer dvdPlayer, Woofer woofer){
        this.amplifier = amplifier;
        this.tv = tv;
        this.dvdPlayer = dvdPlayer;
        this.woofer = woofer;
    }

    public void watchMovie(){
        System.out.println("starting the system");
        amplifier.on();
        tv.on();
        dvdPlayer.on();
        woofer.on();
        System.out.println("Yay the system is up");
    }
}