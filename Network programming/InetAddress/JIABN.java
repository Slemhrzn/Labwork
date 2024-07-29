import java.net.InetAddress;
import java.net.UnknownHostException;

public class JIABN {
    public static void main(String[] args) {
        try{
            InetAddress ad = InetAddress.getByName("www.javapoint.com");
            System.out.println(ad);
        }
        catch(UnknownHostException ex){
            System.out.println(ex);
        }
    }
}
