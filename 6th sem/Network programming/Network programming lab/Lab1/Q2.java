import java.net.InetAddress;
import java.net.UnknownHostException;

public class Q2 {
    public static void main(String[] args) {
        try{
            InetAddress address = InetAddress.getLocalHost();
            System.out.println(address);
        }catch (UnknownHostException ex){
            System.out.println("Could not find this computer's address");
        }
    }
}
