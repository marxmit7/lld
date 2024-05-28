package logger.src.com.logger;

public class ConsoleAppender implements Appender{

    @Override 
    public void append(LogLevel logLevel, String message){
        System.out.println("["+logLevel+"]"+" : "+message);
    }
}