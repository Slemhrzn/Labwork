
import java.net.*;

//to check if two hostname is same or not
public class SameHost {
    public static void main(String[] args) {
        try{
            InetAddress iad = InetAddress.getByName("www.ibiblio.org");
            InetAddress had = InetAddress.getByName("helios.ibiblio.org");
            if(iad.equals(had)){
                System.out.println("Same");
            }
            else{
                System.out.println("Different");
            }
        }
        catch(UnknownHostException ex){
            System.out.println(ex);
        }
    }
}
