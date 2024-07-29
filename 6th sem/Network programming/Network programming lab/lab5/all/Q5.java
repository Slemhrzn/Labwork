import java.io.*;
import java.net.*;

public class Q5 {
    public static void main(String[] args) {
        try {
            URL u = new URL("https://www.song-on.vercel.com/");
            URLConnection uc = u.openConnection();
            System.out.println(uc.getURL());
        }catch (IOException ex){
            System.err.println(ex);
        }
    }
}
