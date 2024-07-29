import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Q4 {
    public static void main(String[] args) {
        try{
            InetAddress address = InetAddress.getByName("ipv4.google.com");
            if(address instanceof Inet6Address){
                System.out.println("IPV6 = "+ address.getHostAddress());
            }
            if(address instanceof Inet4Address){
                System.out.println("Ipv4 = "+ address.getHostAddress());
            }

        }catch (UnknownHostException ex){
            ex.printStackTrace();
        }
    }
}
