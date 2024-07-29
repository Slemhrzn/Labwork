import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
//WAP URL Socket Connection

public class Q1 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("www.song-on.vercel.app",80);
            System.out.println("Connected to " +socket.getInetAddress()+" on port"+socket.getPort()+" from port "+socket.getLocalPort()+" of "+socket.getLocalAddress());
        }
        catch (UnknownHostException ex){
            System.err.println("I cant find the host");
        }
        catch (SocketException ex){
            System.err.println("Could not connect to host");
        }
        catch (IOException ex){
            System.err.println(ex);
        }
    }
}