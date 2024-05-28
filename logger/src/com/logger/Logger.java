package logger.src.com.logger;

import java.util.List;
import java.util.ArrayList;

public class Logger{
    private LogLevel logLevel;
    private String name;
    private List<Appender> appenderList;

    public Logger(String name, LogLevel logLevel){
        this.logLevel = logLevel;
        this.name = name;
        this.appenderList = new ArrayList<>();
    }

    public void addAppenders(Appender appender){
        this.appenderList.add(appender);
    }

    public void log(LogLevel level, String message){
        if(this.logLevel.ordinal()<=level.ordinal()){
            for(Appender appender:appenderList){
                appender.append(logLevel, message);
            }
        }
    }

    public void info(String message){
        this.log(LogLevel.INFO, message);

    }
    public void debug(String message){
        this.log(LogLevel.DEBUG, message);

    }
    public void error(String message){
        this.log(LogLevel.ERROR, message);

    }
    public void warn(String message){
        this.log(LogLevel.WARN, message);

    }
    public void trace(String message){
        this.log(LogLevel.TRACE, message);

    }
}