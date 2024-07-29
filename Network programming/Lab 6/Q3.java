import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

//3. WAP for the higher Port
public class Q3 {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("127.0.0.1");
            for (int i=1024; i<6000;i++){
                try {
                    Socket socket = new Socket(address, i);
                    System.out.println("There is a server on port "+i+"of Localhost.");
                }catch (IOException e){
// System.err.println("There is a server off port "+i+" of localhost");
                }
            }
        }catch (UnknownHostException e1){
            System.out.println("unknwon Host.");
        }
    }
}
