import java.io.*;
import java.net.*;
import java.net.URLConnection;


public class URLbufferreader {



        public static void main(String[] args) {
            try {
                URL u = new URL("https://song-on.vercel.app/");
                URLConnection uc = u.openConnection();
                BufferedReader in_data = new BufferedReader(new InputStreamReader(uc.getInputStream()));

                String entry;
                while ((entry=in_data.readLine())!=null){
                    System.out.println(entry);
                }
            }catch (MalformedURLException ex){
                System.err.println("It is not a parseable Url");
            }
            catch (IOException ex){
                System.err.println(ex);
            }
        }
    }


