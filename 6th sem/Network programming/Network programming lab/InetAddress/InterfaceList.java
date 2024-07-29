import java.net.*;
import java.util.Enumeration;

//to list all network interface
public class InterfaceList {
    public static void main(String[] args) {
        Enumeration<NetworkInterface> interfaces = null;
        try {
            interfaces = NetworkInterface.getNetworkInterfaces();
        } catch (SocketException e) {
            throw new RuntimeException(e);
        }
        while(interfaces.hasMoreElements()){
                 NetworkInterface in = interfaces.nextElement();
                 System.out.println(in);
             }
    }
}
