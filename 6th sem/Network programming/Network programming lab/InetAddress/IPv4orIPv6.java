
import java.net.*;

public class IPv4orIPv6 {
    public static void main(String[] args) {
        try{
            InetAddress add = InetAddress.getByName("www.kbc.edu.np");
            byte[] address = add.getAddress();

            if(address.length == 4){
                System.out.println("IPV4");
            }
            else{
                System.out.println("IPV6");
            }
        }
        catch(UnknownHostException ex){
            System.out.println(ex);
        }
    }
}
