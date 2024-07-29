import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
//4. WAP low port scanner
public class Q4 {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            try {
                Socket socket = new Socket("localhost", i);
                System.out.println("There is a server on port " + i + " of localhost.");
                socket.close(); // Close the socket after checking
            } catch (UnknownHostException e) {
                System.out.println("Unknown host exception: " + e.getMessage());
            } catch (IOException e) {
                System.out.println("There is no server on port " + i + " of localhost.");
            }
        }
    }
}
