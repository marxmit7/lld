package logger.src.com.logger;

public class LoggerConfiguration {
    private static LoggerConfiguration instance;
    private LogLevel logLevel;

    private LoggerConfiguration(){
        this.logLevel = LogLevel.INFO;
    }

    public synchronized static LoggerConfiguration getInstance(){
        if(instance==null)
            instance = new LoggerConfiguration();

        return instance;
    }

    public void setDefaultLogLevel(LogLevel logLevel){
        this.logLevel = logLevel;
    }

    public LogLevel getConfigurationLogLevel(){
        return this.logLevel;
    }
}