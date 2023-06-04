package network.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    // 1. Server Socket Create
    // 2. Server Socket Binding(Port and IP Address)
    // 3. Server Socket Listening to Clients Request
    // 4. Read and Write
    public static void main(String[] args) throws IOException {
        int port = 5050;

        ServerSocket ssk = new ServerSocket(port); // 1. Server Socket Create / 2. Server Socket Binding(Port and IP Address)
        System.out.println("Server is waiting for clients");

        while(true){
            Socket socket = ssk.accept(); // 3. Server Socket Listening to Clients Request
            System.out.println("Client is connected"); // 4. Read and Write
            System.out.println("Client's IP : " + socket.getInetAddress());
        }
    }
}
