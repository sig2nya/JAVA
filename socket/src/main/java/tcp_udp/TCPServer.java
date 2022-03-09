package tcp_udp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket clientSocket;
        OutputStream os1;
        DataOutputStream os2;
        InputStream is1;
        DataInputStream is2;

        try{
            serverSocket = new ServerSocket(5432);
        } catch (Exception e){ e.printStackTrace(); }
        while(true) {
            try{
                System.out.println("클라이언트 대기중...");
                clientSocket = serverSocket.accept();
                System.out.println("클라이언트 접속 성공!");
                os1 = clientSocket.getOutputStream(); // Server -> Client 응답
                os2 = new DataOutputStream(os1); // Server -> Client 출력
                os2.writeUTF("Welcom to connect to TCP Server!");

                is1 = clientSocket.getInputStream();
                is2 = new DataInputStream(is1);
                String st = new String(is2.readUTF());
                System.out.println(st);
                is1.close();
                is2.close();
                os1.close();
                os2.close();
                clientSocket.close();
            } catch (IOException e) { e.printStackTrace(); }
        }
    }
}
