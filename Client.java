
package first;

import java.io.*; 
import java.net.*; 
import java.io.IOException;

public class Client {


    public static void main(String[] args) {
        try{
            System.out.println("Waiting for connection....I'm client");
            Socket socket = new Socket("localhost",6696);
            System.out.println("Connection established");
            
            BufferedReader in_socket = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            
            PrintWriter out_socket = new PrintWriter(socket.getOutputStream(),true);
            out_socket.println("Hello Server");
            
            String msg = "";
            msg = in_socket.readLine();
            System.out.println(msg);
            
            socket.close();  
        }
        catch(IOException e){
            e.printStackTrace(); 
        }
    }    
}
