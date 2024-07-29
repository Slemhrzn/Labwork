
    import java.net.*;
//•  Write a program to display the socket information address,port,localaddress,localportaddress, port, local address, local portaddress,port,localaddress,localport.
    public class SocketInfoExample {
        public static void main(String[] args) {
            try {
                // Create a socket object
                Socket socket = new Socket();

                // Connect to a remote host (replace with your desired host and port)
                String remoteHost = "www.song-on.vercel.app";
                int remotePort = 80;
                socket.connect(new InetSocketAddress(remoteHost, remotePort));

                // Get socket information
                InetAddress address = socket.getInetAddress();
                int port = socket.getPort();
                InetAddress localAddress = socket.getLocalAddress();
                int localPort = socket.getLocalPort();

                // Print socket information
                System.out.println("Socket Information:");
                System.out.println("Address: " + address.getHostAddress());
                System.out.println("Port: " + port);
                System.out.println("Local Address: " + localAddress.getHostAddress());
                System.out.println("Local Port: " + localPort);

                // Close the socket
                socket.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
