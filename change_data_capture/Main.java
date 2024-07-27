package bs;

public class Main{
    public static void main(String[] args){
        String logFilePath = "/Users/amitkumar.ry/catex/learn/bs/file.log";

        System.out.println("starting log watcher thread");
        LogFileWatcher logFileWatcher = new LogFileWatcher(logFilePath);
        Thread watcherThread = new Thread(logFileWatcher::watch);
        watcherThread.start();
        System.out.println("log watcher thread started");

        System.out.println("starting server");
        startServer(logFileWatcher);
        System.out.println("server started");
    }

    private static void startServer( LogFileWatcher logFileWatcher ) {
        LogWebServer logWebServer = LogWebServer.getInstance(logFileWatcher);
        Thread serverThread = new Thread(logWebServer::start);
        serverThread.start();
    }
}