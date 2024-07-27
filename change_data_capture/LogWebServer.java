package bs;

import java.io.*;
import java.net.*;
import java.nio.file.Files;
import java.util.*;
import java.nio.file.*;

public class LogWebServer implements Observer {

    private static LogWebServer logWebServerInstance;
    private final List<Socket> clients = new ArrayList<>();
    private LogFileWatcher logFileWatcher;
    int PORT = 12345;

    private LogWebServer(LogFileWatcher logFileWatcher) {
        this.logFileWatcher = logFileWatcher;
    }

    public static synchronized LogWebServer getInstance(LogFileWatcher logFileWatcher) {
        if (logWebServerInstance == null) {
            logWebServerInstance = new LogWebServer(logFileWatcher);
        }
        return logWebServerInstance;
    }

    public void start() {

        try {
            ServerSocket serverSocket = new ServerSocket(PORT);

            while (true) {
                Socket client = serverSocket.accept();
                clients.add(client);
                new Thread(() -> handle(client)).start();
            }

        } catch (IOException e) {
            System.out.println("issue in connecting  to the socket server");
        }
    }

    private void handle(Socket client) {

        try {
            sendLast10Lines(client);
        } catch (Exception e) {
            System.out.println("exception happened: " + e.getMessage());
        }
    }

    private void sendLast10Lines(Socket client) {

        try {
            System.out.println("\n\nsent last 10 lines ");

            List<String> lines = Files.readAllLines(Paths.get(logFileWatcher.getLogFilePath()));
            int start = Math.max(0,lines.size() - 10);
            PrintWriter out = new PrintWriter(client.getOutputStream(), true);

            for (int i = start; i < lines.size(); i++) {
                out.println(lines.get(i));
                System.out.println("i: "+i+"  "+lines.get(i));

            }

        } catch (IOException e) {
            System.out.println("unable to read the file: " + e.getMessage());
        }
    }

    @Override
    public void update(String logUpdate) {

        for (Socket client : clients) {
            try {
                PrintWriter out = new PrintWriter(client.getOutputStream(), true);
                out.println(logUpdate);
                // System.out.println("new line: "+logUpdate);
            } catch (Exception e) {
                System.out.println("unable to write to the client"+ e.getMessage());
            }
        }
    }

}