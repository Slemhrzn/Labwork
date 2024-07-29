import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8080);
            System.out.println("Connected to the server");

            BufferedReader in_socket = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedReader in_user = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out_socket = new PrintWriter(socket.getOutputStream(), true);

            String message;
            while (true) {
                System.out.print("Enter message: ");
                message = in_user.readLine();
                out_socket.println(message);
                System.out.println("Server response: " + in_socket.readLine());
                if (message.endsWith(".")) {
                    break;
                }
            }

            in_socket.close();
            out_socket.close();
            socket.close();
        } catch (UnknownHostException e) {
            System.err.println("Unknown host");
        } catch (IOException e) {
            System.err.println("IO exception: " + e.getMessage());
        }
    }
}
