import java.io.*;
import java.net.*;
//WAp for Socket Creation
public class Q2 {
    //use  Q5 to connect to this port
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(2)) {
            System.out.println("Server is listening on port 8080");
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("New client connected");
                new ServerThread(socket).start();
            }
        } catch (IOException ex) {
            System.out.println("Server exception: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}

class ServerThread extends Thread {
    private Socket socket;

    public ServerThread(Socket socket) {
        this.socket = socket;
    }

    public void run() {
        try (BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter output = new PrintWriter(socket.getOutputStream(), true)) {

            String text;

            while ((text = input.readLine()) != null) {
                System.out.println("Received: " + text);
                output.println("Server: " + text);
                if (text.endsWith(".")) {
                    break;
                }
            }
            socket.close();
        } catch (IOException ex) {
            System.out.println("Server exception: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
