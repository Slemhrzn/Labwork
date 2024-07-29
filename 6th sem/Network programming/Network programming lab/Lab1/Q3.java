import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Q3 {
    public static void main(String[] args) {
        try{
            //create an InetAddress object for a hostname
            InetAddress address1 = InetAddress.getByName("song-on.vercel.app");
            System.out.println("Address 1: "+ address1 );
            printAddressDetails(address1);
            InetAddress address2 = InetAddress.getByName("76.76.21.123");
            System.out.println("Address 2:" + address2);
            printAddressDetails(address2);

            InetAddress localAddress = InetAddress.getLocalHost();
            System.out.println("Local address "+ localAddress);
            printAddressDetails(localAddress);
            InetAddress[] allAddress = InetAddress.getAllByName("www.google.com");
            for (InetAddress address: allAddress){
                System.out.println("Google address "+ address);
                printAddressDetails(address);
            }
        }catch (UnknownHostException ex){
            System.out.println("Could not find this address");
        }
    }

    public static void printAddressDetails(InetAddress address){
        System.out.println("Canonical Hostname: "+address.getCanonicalHostName());
        System.out.println("Host Address: "+ address.getHostAddress());
        System.out.println("Host Name: "+ address.getHostName());
        System.out.println("Is any local address "+ address.isAnyLocalAddress());
        System.out.println("Is Link local address "+ address.isLinkLocalAddress());
        System.out.println("Is Loopback address "+ address.isLoopbackAddress());
        System.out.println("Is Multicast Address "+ address.isMulticastAddress());
        System.out.println("Is site local address " +address.isSiteLocalAddress());
        System.out.println("\n");
    }
}
