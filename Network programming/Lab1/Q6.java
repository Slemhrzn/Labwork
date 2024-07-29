import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public class Q6 {
    public static void main(String[] args) {
        try {
            Enumeration<NetworkInterface> networkInterface = NetworkInterface.getNetworkInterfaces();
            while (networkInterface.hasMoreElements()){
                NetworkInterface networkInterface1 = networkInterface.nextElement();

                System.out.println("Name: "+networkInterface1.getName());
                System.out.println("Display Name: "+networkInterface1.getDisplayName());
                System.out.println("MTU: "+networkInterface1.getMTU());
                System.out.println("Loopback: "+ networkInterface1.isLoopback());
                System.out.println("Up: "+networkInterface1.isUp());
                System.out.println("Virtual: "+networkInterface1.isVirtual());
                System.out.println();
            }
        }catch (SocketException e){
            e.printStackTrace();

        }

    }
}
