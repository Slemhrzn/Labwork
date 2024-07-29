import java.net.*;

public class CanonicalHostName {
    public static void main(String[] args) {
        try{
            InetAddress machine = InetAddress.getByName("104.21.79.8");
            System.out.println(machine.getCanonicalHostName());
        }
        catch(UnknownHostException ex){
            System.out.println(ex);
        }
    }

}
