import java.io.*;
import java.net.*;

// URL Connection
public class Q1 {

    public static void main(String[] args) {
        try {
            URL u = new URL("https://song-on.vercel.app");
            URLConnection uc = u.openConnection();
            System.out.println("content : "+uc.getDate());
        }
        catch (MalformedURLException ex){
            System.err.println("it is not a parseable url");
        }
        catch (IOException ex){
            System.err.println(ex);
        }
    }

}