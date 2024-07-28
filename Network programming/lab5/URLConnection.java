
import java.io.*;
import java.net.*;


public class URLConnection {


        public static void main(String[] args) {
            try {
                URL u = new URL("https://song-on.vercel.app");
                java.net.URLConnection uc = u.openConnection();
                System.out.println("Content date: " + uc.getDate()); // Corrected the method to get the date
            } catch (MalformedURLException ex) {
                System.err.println("It is not a parseable URL");
            } catch (IOException ex) {
                System.err.println(ex);
            }
        }


}
