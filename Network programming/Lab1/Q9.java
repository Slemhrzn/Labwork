import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

class LogEntry {
    private String ipAddress;
    private String userIdentifier;
    private String userId;
    private LocalDateTime dateTime;
    private String request;
    private int statusCode;
    private int size;

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMM/yyyy:HH:mm:ss Z");

    public LogEntry(String ipAddress, String userIdentifier, String userId, LocalDateTime dateTime, String request, int statusCode, int size) {
        this.ipAddress = ipAddress;
        this.userIdentifier = userIdentifier;
        this.userId = userId;
        this.dateTime = dateTime;
        this.request = request;
        this.statusCode = statusCode;
        this.size = size;
    }

    public static LogEntry parse(String logLine) {
        // Expected format: 127.0.0.1 - frank [10/Oct/2000:13:55:36 -0700] "GET /apache_pb.gif HTTP/1.0" 200 2326
        String[] parts = logLine.split(" ");
        String ipAddress = parts[0];
        String userIdentifier = parts[1];
        String userId = parts[2];
        String dateTimeString = logLine.substring(logLine.indexOf('[') + 1, logLine.indexOf(']'));
        LocalDateTime dateTime = LocalDateTime.parse(dateTimeString, formatter);
        String request = logLine.substring(logLine.indexOf('"') + 1, logLine.lastIndexOf('"'));
        int statusCode = Integer.parseInt(parts[parts.length - 2]);
        int size = Integer.parseInt(parts[parts.length - 1]);

        return new LogEntry(ipAddress, userIdentifier, userId, dateTime, request, statusCode, size);
    }

    @Override
    public String toString() {
        return "LogEntry{" +
                "ipAddress='" + ipAddress + '\'' +
                ", userIdentifier='" + userIdentifier + '\'' +
                ", userId='" + userId + '\'' +
                ", dateTime=" + dateTime +
                ", request='" + request + '\'' +
                ", statusCode=" + statusCode +
                ", size=" + size +
                '}';
    }
}


public class Q9 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java WebLogProcessor <logfile>");
            return;
        }

        String logFile = args[0];
        List<LogEntry> logEntries = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(logFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                try {
                    LogEntry entry = LogEntry.parse(line);
                    logEntries.add(entry);
                } catch (Exception e) {
                    System.err.println("Failed to parse log entry: " + line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (LogEntry entry : logEntries) {
            System.out.println(entry);
        }
    }
}
