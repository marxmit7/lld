package design_pattern.observer.v2;

import java.util.*;

public class Main{
    public static void main(String[] args){

        Display display1 = new Display("a");
        Display display2 = new Display("b");
        Display display3 = new Display("c");

        Station station1 = new Station();
        station1.addObserver(Arrays.asList(display1,display2,display3));

        station1.setMessage("hellow");
    }
}