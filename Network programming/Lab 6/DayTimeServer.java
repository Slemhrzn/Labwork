import java.io.*;
import java.net.*;
import java.util.*;
//•  Write a server side program for daytime service using socket.
class DaytimeServer {
    public static void main(String[] args) {
        try {
            // Create a server socket listening on port 13 (Daytime service port)
            ServerSocket serverSocket = new ServerSocket(3);
            System.out.println("Daytime Server is running and waiting for client connections...");

            while (true) {
                // Wait for a client connection
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connected: " + clientSocket.getInetAddress().getHostAddress());

                // Get the current date and time
                Date currentDate = new Date();
                String daytime = currentDate.toString() + "\r\n";

                // Send the daytime string to the client
                OutputStream outputStream = clientSocket.getOutputStream();
                outputStream.write(daytime.getBytes());

                // Close the client socket
                clientSocket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
