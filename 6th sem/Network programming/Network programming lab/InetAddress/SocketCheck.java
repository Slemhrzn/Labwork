import java.net.*;

//to check the socket
public class SocketCheck {
    public static void main(String[] args) {
        try{
            NetworkInterface n = NetworkInterface.getByName("eth0");
            if(n == null){
                System.out.println("No such interface");
            }else{
                System.out.println(n);
            }
        }
        catch(SocketException ex){
            System.out.println(ex);
        }
    }
}