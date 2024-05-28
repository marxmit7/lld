package logger.src.com.logger;

import java.util.Map;
import java.util.HashMap;

public class LoggerFactory{
    private static Map<String, Logger> loggerMap = new HashMap<>();

    public static Logger getLogger(String name){
        return loggerMap.computeIfAbsent(name, k -> new Logger(name, LoggerConfiguration.getInstance().getConfigurationLogLevel()));
    }
}