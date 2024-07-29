import java.net.InetAddress;
import java.nio.file.Path;

public class Q5 {
    public static void main(String[] args) {
        try{
            InetAddress net = InetAddress.getByName("76.76.21.241");
            if(net.isReachable(1000)){
                System.out.println("Success "+ net + " its reachable");
            }else{
                System.out.println("Failed "+ net +"its not reachable");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
