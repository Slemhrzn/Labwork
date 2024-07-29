import java.net.InetAddress;
import java.net.UnknownHostException;

public class Q8 {
    public static final String BLACKHOLE="sbl.spamhaus.org";
    public static void main(String[] args) throws UnknownHostException {
        for (String arg: args) {
            if (isSpammer(arg)) {
                System.out.println(arg + " is a known spammer.");

            } else {
                System.out.println(arg + " appears legitimate.");

            }
        }
    }
    private static boolean isSpammer(String arg) {
        try {
            InetAddress address = InetAddress.getByName(arg);
            System.out.println(address);
            byte[] quad = address.getAddress(); //bytes not string
            System.out.println("quad"+ quad);
            String query = BLACKHOLE;
            for (byte octet : quad) {
                System.out.println("Octet" + octet);
                int unsignedByte = octet < 0 ? octet + 256: octet;
                query = unsignedByte + "." + query;
            }
            InetAddress.getByName(query);
            System.out.println(InetAddress.getByName(query));;
            return true;
        }
        catch (UnknownHostException e) {
            return false;
        }
    }
}
