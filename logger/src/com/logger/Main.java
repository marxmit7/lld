package logger.src.com.logger;

public class Main{

    public static void main(String[] args){
        LoggerConfiguration loggerConfiguration = LoggerConfiguration.getInstance();
        loggerConfiguration.setDefaultLogLevel(LogLevel.INFO);

        Logger logger = LoggerFactory.getLogger(Main.class.getName());
        logger.addAppenders(new ConsoleAppender());

        logger.log(LogLevel.DEBUG, "this is a debuggin message");
        logger.log(LogLevel.INFO, "this is a info message");

    }
}