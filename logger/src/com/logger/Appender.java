package logger.src.com.logger;

public interface Appender{
    void append(LogLevel logLevel, String message);
}