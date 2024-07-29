import java.net.InetAddress;
import java.net.UnknownHostException;

public class Q7 {
    public static void main(String[] args) {
        try{
            InetAddress ibilio = InetAddress.getByName("www.ibilio.org");
            InetAddress helios = InetAddress.getByName("helios.ibilio.org");
            if(ibilio.equals(helios)){
                System.out.println("www.ibiblio.org is the same as helios.ibiblio.org");
            }else{
                System.out.println("www.ibiblio.org is not the same as helio.ibiblio.org");
            }
        }catch (UnknownHostException ex){
            System.out.println("Host lookup failed ");
        }
    }
}
