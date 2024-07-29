import java.net.InetAddress;
import java.net.UnknownHostException;

public class Q1 {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("song-on.vercel.app");
            System.out.println(address);
        } catch (UnknownHostException ex) {
            System.out.println("Could not find");
        }
    }
}
