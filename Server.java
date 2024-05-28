
package first;

import java.io.*; 
import java.net.*;

import java.io.IOException;

public class Server {

    
    public static void main(String[] args) {
        try{
            ServerSocket serverSocket = new ServerSocket(6696);
            System.out.println("Waiting for connection....I'm server");
            Socket  socket = serverSocket.accept();
            System.out.println("Connected to client");
            
            BufferedReader in_socket = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            
            PrintWriter out_socket = new PrintWriter(socket.getOutputStream(), true);
            out_socket.println("Hello Client");
            
            String msg= "";
            msg = in_socket.readLine();
            System.out.println(msg);
            
            serverSocket.close();
            socket.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    
    
    
    

}
