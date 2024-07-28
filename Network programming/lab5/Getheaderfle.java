package lab5;

import java.net.*;
import java.io.*;

public class Getheaderfle {




        public static void main(String[] args) {
            try{
                URL u = new URL("https://song-on.vercel.app/");
                URLConnection uc = u.openConnection();
                int i=1;
                while (uc.getHeaderField(i)!=null){
                    System.out.println(uc.getHeaderFieldKey(i)+":"+uc.getHeaderField(i));
                    i++;
                }
            }catch (MalformedURLException ex){
                System.err.println("It is not a valid url.");
            }catch (IOException ex){
                System.err.println(ex);
            }
            System.out.println();
        }
    }




