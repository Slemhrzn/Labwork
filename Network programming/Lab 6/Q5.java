import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
//5. Client Socket Connection
public class Q5 {
    public static void main (String [] args) {
        try {
            System.out.println("Waiting for connection...");

            Socket clientSocket=new Socket("localhost", 2); //client needs server's ip/address and port to connect

            System.out.println("Connected to server...");
            BufferedReader br=new BufferedReader(new InputStreamReader(clientSocket.getInputStream())); //read input data
            PrintWriter pw=new PrintWriter(clientSocket.getOutputStream(), true); //write/send output data

            Scanner scanner=new Scanner(System.in); //take input from console
            while(true) { //loop  continues until user enter 'quit' in console

                System.out.println("Enter text: ");
                String inputLine=scanner.nextLine(); //take input from console
                if(inputLine.equalsIgnoreCase("quit")) { //to end chat/connection
                    break;
                }
                pw.println(inputLine); //send typed message in console to server

                String response=br.readLine(); //server echo the message sent by client, so getting response

                System.out.println("Server: " + response); //printing server's     response

            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
