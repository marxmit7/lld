package bs;

import java.util.*;
import java.nio.*;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.io.*;
import java.nio.file.*;


public class LogFileWatcher implements Observable{
    private final  List<Observer> observerList = new ArrayList<>();
    private final String logfile;
    private int lastKnownSize =0;

    public LogFileWatcher(String logFilePath){
        this.logfile = logFilePath;
    }

    public void watch(){
       for(Integer i =0 ;i<100;i++){
        // notifyAllObserver(i.toString());
       }
       watchNow();

    }

    private void watchNow(){

        Path logFile = Paths.get(logfile);
        Path logDir = logFile.getParent();
        if (logDir == null) {
            System.err.println("Invalid log file path: " + logfile);
            return;
        }

        try{

            WatchService watchService = FileSystems.getDefault().newWatchService();
            // Path dir = Paths.get(logfile).getParent();
            logDir.register(watchService, StandardWatchEventKinds.ENTRY_MODIFY);

            while(true){
                WatchKey key = watchService.take();

                for(WatchEvent<?>event : key.pollEvents()){
                    if(event.kind()==StandardWatchEventKinds.ENTRY_MODIFY){
                        Path changed = (Path) event.context();

                        if(changed.endsWith(Paths.get(logfile).getFileName())){
                            List<String> newLines = readNewLines();

                            for(String line: newLines){
                                // notifyAllObserver(line);
                                System.out.println("new line: "+line);
                            }
                        }
                    }
                }
            }

        } catch(Exception e){
            System.out.println("problem in watching the file"+e.getMessage());
        }
    }

    public String getLogFilePath(){
        return logfile;
    }

    private List<String> readNewLines() {
        try{
            List<String> allLines = Files.readAllLines(Paths.get(logfile));
            List<String> newLines = allLines.subList((int)lastKnownSize, allLines.size());
            System.out.println("last known size: "+lastKnownSize +" last size: "+allLines.size());

            lastKnownSize = allLines.size();
            return newLines;

        } catch(Exception e){
            System.out.println("exception happened while new lines");
        } 

        return new ArrayList<>();

    }


    @Override 
    public void addObserver(Observer observer){
        observerList.add(observer);
    }

    @Override 
    public void removeObserver(Observer observer){
        observerList.remove(observer);
    }

    @Override
    public void notifyAllObserver(String logUpdate){
        for(Observer observer : observerList){
            observer.update(logUpdate);
        }
    }
    
}