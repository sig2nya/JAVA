package network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class DemoServer {
    public static void main(String[] args) throws IOException {
        int port = 5050;
        ServerSocket ssk = new ServerSocket(port); // ServerSocket 설정

        System.out.println("접속 대기중...");

        while(true){
            Socket socket = ssk.accept();
            System.out.println("사용자 접속 완료.");
            System.out.println("Client IP : " + socket.getInetAddress());
        }
    }
}
