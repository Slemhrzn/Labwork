import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
//use Q5 to connect to this port
//6. WAP Server Socket Connection
public class Q6 {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(5678); // server listening at port 5678
            System.out.println("Waiting for connection...");
            Socket clientSocket = serverSocket.accept(); // serverSocket will block this call until it receives a request from a client

            System.out.println("Connection established..."); // when request is received, the accept method will return a socket class instance.
            BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter pw = new PrintWriter(clientSocket.getOutputStream(), true);
            String inputLine;
            while ((inputLine = br.readLine()) != null) {
                System.out.println("\nServer: " + inputLine);
                pw.println(inputLine); // echo the received message back to the client
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
